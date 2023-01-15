package io.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends ParentPage
{

    @FindBy(xpath = "//p[text()='Giriş Yap']")
    public WebElement girisYapLinkText;

    @FindBy(xpath = "//div[@class='login-button']")
    public WebElement girisYapButonu;








}
