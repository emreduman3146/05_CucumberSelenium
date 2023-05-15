package io.cucumber.hooks;

import io.cucumber.java.*;
import io.cucumber.java.BeforeAll;
import io.cucumber.utilities.PageObjectUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.TestNG;

public class Hooks
{

    //Tum feature filelardan once birkez calisir
    //static olmak zorunda
    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll");
    }


    //Her bir scenariodan once calisir
    @Before(order=1, value="@tag and not @tag2")
    public void beforeScenario(Scenario scenario) {
        System.out.println("beforeScenario");
     }

    @Before(order=2)
    public void beforeScenario2(Scenario scenario) {
        System.out.println("beforeScenario2");
        PageObjectUtil.initializeObjects();

    }



    //Her bir gherkin step'inden once calisir
    @BeforeStep
    public void beforeStep() {
        System.out.println("beforeStep");
    }


    @AfterStep
    public void afterStep() {
        System.out.println("afterStep");
    }

    @After
    public void afterScenario() {
        System.out.println("afterScenario");
    }


    @AfterAll//static olmak zorunda
    public static void AfterAll() {
        System.out.println("AfterAll");
    }

}
