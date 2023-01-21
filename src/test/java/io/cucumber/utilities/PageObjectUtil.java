package io.cucumber.utilities;

import io.cucumber.pages.CountrySelectPage;
import io.cucumber.pages.HomePage;
import io.cucumber.pages.LoginPage;
import io.cucumber.pages.UserHomePage;
import io.cucumber.driver.Driver;
import org.openqa.selenium.interactions.Actions;

import static io.cucumber.driver.Driver.getDriver;

public class PageObjectUtil
{

    public Actions actions=new Actions(Driver.getDriver());
    public CountrySelectPage countrySelectPage=new CountrySelectPage();
    public HomePage homePage=new HomePage();
    public LoginPage loginPage=new LoginPage();
    public UserHomePage userHomePage=new UserHomePage();

}
