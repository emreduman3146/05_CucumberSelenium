package io.cucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import static io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE;

@CucumberOptions//burayi Java Array gibi dusunebilirsiniz
(
        plugin = {"pretty",//Pretty: Prints the Gherkin source with additional colors and stack traces for errors.
                "json:target/cucumber-testng-report/cucumber.json",//HTML: This will generate a HTML report at the location mentioned
                "html:target/cucumber-testng-report/cucumber.html",
                "pretty:target/cucumber-testng-report/cucumber-pretty.txt",
                "usage:target/cucumber-testng-report/cucumber-usage.json"
        },
    features = "src/test/resources/features/",//cucumber scanerilarimizin geldigi package
    glue = {"io/cucumber/stepdefinitions"},//uhulamak, stepDefinitionlarimizin geldigi package
    tags = "@US02_tablo",
    dryRun = false,// hazir olmayan gherkin steplerinin orneklerini verir, terminalde
    //publish = true,
    monochrome = true,//if you want console output from Cucumber in a readable format, you can specify it true
    snippets = CAMELCASE//UNDERSCOREThe default option for `snippets` is `UNDERSCORE`.
)
public class CucumberRunner_testNG  extends AbstractTestNGCucumberTests
{


}


