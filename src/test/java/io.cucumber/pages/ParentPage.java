package io.cucumber.pages;

import org.openqa.selenium.support.PageFactory;

import static io.cucumber.driver.Driver.getDriver;

public abstract class ParentPage
{
    public ParentPage()
    {
        PageFactory.initElements(getDriver(),this);
    }
}
