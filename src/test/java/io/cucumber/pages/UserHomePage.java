package io.cucumber.pages;

import io.cucumber.utilities.GenericWebelementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class UserHomePage extends ParentPage implements GenericWebelementUtil
{

    @FindBy(xpath = "//p[contains(text(),'Hesabım')]")
    public WebElement hesabim;
    @FindBy(xpath = "//p[@class='user-name']")
    public WebElement username;
    @FindBy(xpath = "//p[text()='Çıkış Yap']")
    public WebElement cikisYapButonu;

    @FindBy(css = "[id='autoCompleteAppWrapper'] input")
    public WebElement aramaMotoru;

    @FindBy(css = "[class=\"aggrgtn-cntnr-wrppr\"]")
    public WebElement filtreMenusu;


    @FindBy(css="data-testid=\"search-icon\"")
    public WebElement aramaSembolu;

    @FindBy(xpath="//*[@class='fltr-item-text' and text()='Erkek']")
    public WebElement filtre;




    //*[@class="fltr-item-text" and text()='Erkek']


}
