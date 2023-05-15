package io.cucumber.utilities;

import io.cucumber.pages.*;
import io.cucumber.driver.Driver;
import org.openqa.selenium.interactions.Actions;

import static io.cucumber.driver.Driver.getDriver;

public class PageObjectUtil
{


    static public  Actions actions;
    static public  CountrySelectPage countrySelectPage;
    static public  UserHomePage userHomePage;
    static public  LoginPage loginPage;
    static public  HomePage homePage;
    //static public GenericWebelementUtil genericPageObjects;


    public static void initializeObjects()
    {
        actions=new Actions(Driver.getDriver());
        countrySelectPage=new CountrySelectPage();
        userHomePage=new UserHomePage();
        loginPage=new LoginPage();
        homePage=new HomePage();
        //genericPageObjects=new GenericWebelementUtil();
    }



}
