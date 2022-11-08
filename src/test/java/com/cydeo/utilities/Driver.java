package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    // singlton conception bellow
    // created private constructor, so we closing access to creating object of this class from another class

    private Driver() {
    }

    // making driver instance private, so it is not reachable outside that class
    // static because we will use it in static method, and we want it run before anything else


    // create reusable utility method which will return same driver instance when call it

   // private static WebDriver driver; // first time it will be null interchanged that to  private static InheritableThreadLocal <WebDriver> driverPool = new InheritableThreadLocal<>() in ordr to setup ability to use parallet testing

    private static InheritableThreadLocal <WebDriver> driverPool = new InheritableThreadLocal<>();

    public static WebDriver getDriver() {

        //depending on the browserType our switch statement will determine to open specific type of browser/driver
        if (driverPool.get() == null) {
            String browserType = ConfigurationReader.getProperty("browser").toLowerCase();
            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driverPool.set(new SafariDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }

//same driver instance will be return every time we call Driver.getDriver() method
        return driverPool.get();
    }

// we use that method to close opened driver
public static void closeDriver (){
       if (driverPool.get()!= null) {
           driverPool.get().quit(); // this line kill the current session, value will NOT null, because driver object still exist
           driverPool.remove(); //- we assign driver object value NULL, now driver is null
       }
}
}
