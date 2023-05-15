package io.cucumber.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static io.cucumber.utilities.BrowserSettingsUtil.chromeSettings;


public class Driver {



    private static WebDriver driver;//null driver declare ediliyor


    public static WebDriver getDriver(String browser)//browser parameter coming feature file
    {
        if (driver == null)
        {

            browser = browser == null ? "chrome" : browser;

            switch (browser)
            {
                case "chrome":

                    driver= WebDriverManager.chromedriver().avoidShutdownHook().capabilities(chromeSettings()).create();
                    break;

                case "firefox":
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments("--start-maximized");
                    URL initialURL=null;
                    try {
                        initialURL=new URL("htpps://www.google.com/");
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    driver= new RemoteWebDriver(initialURL,firefoxOptions);
                    break;
                case "edge":
                    EdgeOptions option3=new EdgeOptions();
                    option3.addArguments("--start-maximized");
                    driver= new EdgeDriver(option3);
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();//Selenium 3'te browser baslatma sekli boyle idi
                    driver=new InternetExplorerDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver=new SafariDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();//setup()  eski driver olusturma yontemidir
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
            }
        }

        return driver;
    }




    public static WebDriver getDriverByDefaultBrowser()
    {
        return getDriver(null);
    }


    public static WebDriver getDriver()
    {
        if (driver==null)
        {
            getDriver("chrome");
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;//BUNU YAZIN KESINLIKLE CUNKU BIZ QUIT ILE BROWSERI KAPATSAK BILE DRIVER NULL OLMAZ
        }
    }
}
