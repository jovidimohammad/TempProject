package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.print.DocFlavor;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){

    }

    private static WebDriver driver;

    public static WebDriver getDriver(){

        if (driver == null) {
            String browser = ConfigReader.getProperty("browser");

            switch (browser) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();

                case "chrome-remote":
                    ChromeOptions chromeOptions = new ChromeOptions();

                    try {
                        URL url = new URL("http://51.91.183.22:4444/wd/hub");
                        driver = new RemoteWebDriver(url,chromeOptions);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;

            }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//waits 10 secs implicitly if any exception accuser
        driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver(){
        if(driver !=null){
            driver.quit();
            driver = null;
        }
    }
}
