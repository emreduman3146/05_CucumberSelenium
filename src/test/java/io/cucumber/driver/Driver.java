package io.cucumber.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;



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
                    ChromeOptions option1=new ChromeOptions();

                    //browser maximized baslasin, sag-sol ustten cikan alert_popUp'lar otomatik kapatilsin
                    option1.addArguments("--start-maximized","--disable-notifications");

                    //bloke eden pop=up'larin cikmasini engeller, otomasyon yapiliyordur yazisini kaldirir.
                    option1.setExperimentalOption("excludeSwitches", new String[]{"disable-popup-blocking","enable-automation"});

                    driver= WebDriverManager.chromedriver().avoidShutdownHook().capabilities(option1).create();
                    break;

                case "firefox":
                    driver= new FirefoxDriver();
                    driver.manage().window().maximize();
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
