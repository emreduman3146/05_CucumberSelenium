package io.cucumber.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.io.IOException;
import java.time.Duration;
import static io.cucumber.driver.Driver.getDriver;

/**
 * Description - This util class has multiple methods to perform wait action with selenium-java
 *             - It contains hard/implicit/explicit(WebdriverWait,FluentWait) waiting methods
 * @author Duman, Emre
 * @since 1.0
 */
public class WaitUtil
{


    /**
     * Description: This is for hard waiting with java Thread class
     * @param second to wait
     * @author Emre Duman
     * @see TakeScreenShotsUtil#takeScreenshot
     * Date - January 14, 2023
     */
    public static void waitFor(int second)
    {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
        WebElement e=wait.until(ExpectedConditions.visibilityOf(element));
        return e;
    }


    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
        WebElement e= wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return e;
    }


    public static <T> WebElement waitForClickablility(T element_YA_DA_locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
        WebElement element=null;
        if (element_YA_DA_locator instanceof WebElement)
            element= wait.until(ExpectedConditions.elementToBeClickable((WebElement) element_YA_DA_locator));

        if (element_YA_DA_locator instanceof By)
            element= wait.until(ExpectedConditions.elementToBeClickable((By) element_YA_DA_locator));

        return element;
    }


    public static void waitForPageToLoad(long timeout)
    {
        //JAVADA ANONYMOUS KONUSU - ISTEYENLER GOOGLE'SINLAR, TESTCILER BILMEZ BU KONUYU
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>()
        {
            public Boolean apply(WebDriver driver)
            {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };

        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
            wait.until(expectation);
        }
        catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeout + " seconds");
        }
    }

    /**
     * @deprecated As of version 1.3, replaced by {@link #waitForPageToLoad(long)}}
     * @param timeout
     */
    public static void waitForPageToLoad(int timeout)
    {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
    }

    public static WebElement fluentWait(final WebElement webElement, int timeout)
    {

        //FLUENT WAIT TANIMLANDI - DAHA KULLANILMADI
        Wait wait = new FluentWait(getDriver())
                .withTimeout(Duration.ofMillis(timeout))//max 5 seconds beklet driveri
                .pollingEvery(Duration.ofMillis(500))//Bu 5 saniye icinde de tolamda 10 tekrar yap
                .ignoring(Exception.class)//ne tur hata cikarsa ciksin, Exception bunlrin babasidir, yabni o hatayi yakala
                .withMessage("Fluent wait kullaniyorum");


        //YUKARDA TANIMLANAN WAIT'IN BIR WEBELEMENTE UYGULANMASI
        return (WebElement) wait.until(driver -> { return webElement; });//BEKLENILMESINI ISTEDIGIMIZ WEBELEMENT

    }


}
