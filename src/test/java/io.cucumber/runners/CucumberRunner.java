package io.cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


//Cucumber bir BDD(Behaviour driven development) testing Frameworktur.
//Cucumber tek basina bir sey ypamaz. Ya Junit ya da testNG y' kullanmak zorunda
@RunWith(Cucumber.class)
@CucumberOptions//burayi Java Array gibi dusunebilirsiniz
(
        plugin = {"pretty",
                "json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-report/cucumber.html",
                "junit:target/cucumber-report/cucumber.xml",
                "pretty:target/cucumber-report/cucumber-pretty.txt",
                "usage:target/cucumber-report/cucumber-usage.json"
        },
    features = "src/test/resources/features",
    glue = {"stepdefinitions"},//uhulamak
    tags = "@positive",
    dryRun = false// hazir olmayan gherkin steplerinin orneklerini verir, terminalde
)
public class CucumberRunner
{

}
