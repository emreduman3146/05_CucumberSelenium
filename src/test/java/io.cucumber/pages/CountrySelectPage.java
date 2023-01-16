package io.cucumber.pages;


import io.cucumber.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import static io.cucumber.driver.Driver.getDriver;


//PAGE OBJECT MODEL-> SELENIUM OTOMASYON KUTUPHANESININ BIZE SUNDUGU BIR KALIPTIR/PATTERNDIR
public class CountrySelectPage extends ParentPage
{


    //public static WebElement countryDropDown0 = getDriver().findElement(By.xpath("//div[@class='country-select']//select"));//static methodtur. static import ile erisim sagladik.

    @FindBys//hepsi dogru ise locate islemi basarli bir sekilde olur
    (
        {
            //@FindBy(xpath = "//div[@class='country-select']//select"),
            //@FindBy(css = "[class='country-select']>select")

            @FindBy(css = "[class='country-select']"),//parent webelement
            @FindBy(tagName = "select")//child webelement

        }
    )
    public WebElement countryDropDown;


    @FindAll//herhangi birtanesi dogru ise locate islemi basarli bir sekilde olur
    (
        {
            @FindBy(xpath = "//button[text()='Select']"),
            @FindBy(xpath = "//button[text()='Selectfdfdfdfdfdfdf']")
        }
    )
    public WebElement countrySelectButton;










}
