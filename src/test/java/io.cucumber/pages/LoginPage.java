package io.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends ParentPage
{


    @FindBy(xpath = "//button[@class='q-primary q-fluid q-button-medium q-button submit']//span[text()='Giriş Yap']")
    public WebElement girisFormuGirisYapButonu;

    @FindBy(id = "login-email")
    public WebElement girisFormuEmailTextBox;

    @FindBy(id = "login-password-input")
    public WebElement girisFormuSifreTextBox;


    @FindBy(css = "#error-box-wrapper span:nth-child(2)")
    public WebElement hataMesaji;
}
