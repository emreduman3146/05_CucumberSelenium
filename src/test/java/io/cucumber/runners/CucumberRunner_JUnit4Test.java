package io.cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
import static io.cucumber.junit.CucumberOptions.SnippetType.UNDERSCORE;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty",
                "json:target/cucumber-report/cucumber.json",//HTML: This will generate a HTML report at the location mentioned
                "html:target/cucumber-report/cucumber.html",
                "junit:target/cucumber-report/cucumber.xml",
                "pretty:target/cucumber-report/cucumber-pretty.txt",
                "usage:target/cucumber-report/cucumber-usage.json"
        },
        features = "src/test/resources/features/",
        glue = {"io/cucumber/stepdefinitions","io/cucumber/hooks"},
        dryRun = false,
        tags = ("@InvalidCredentials"),
        monochrome = false,
        publish = false,
        snippets = UNDERSCORE

)
public class CucumberRunner_JUnit4Test
{




}
