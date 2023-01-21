package io.cucumber.pages;

import io.cucumber.driver.Driver;
import org.openqa.selenium.support.PageFactory;


public abstract class ParentPage
{
    public ParentPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
