package io.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class UserHomePage extends ParentPage
{

    @FindBy(xpath = "//p[contains(text(),'Hesabım')]")
    public WebElement hesabim;
    @FindBy(xpath = "//p[@class='user-name']")
    public WebElement username;
    @FindBy(xpath = "//p[text()='Çıkış Yap']")
    public WebElement cikisYapButonu;

}
