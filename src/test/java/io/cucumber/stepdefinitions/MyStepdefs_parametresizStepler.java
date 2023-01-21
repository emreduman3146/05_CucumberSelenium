package io.cucumber.stepdefinitions;

import io.cucumber.utilities.PageObjectUtil;
import io.cucumber.utilities.WaitUtil;
import io.cucumber.driver.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import static io.cucumber.driver.Driver.getDriver;


public class MyStepdefs_parametresizStepler extends PageObjectUtil
{


    @Given("Trendyol homepageine navigate edilmesi")
    public void trendyolHomepageineNavigateEdilmesi()
    {
        Driver.getDriver().get("https://www.trendyol.com/");
        WaitUtil.waitFor(2);
    }

    @And("Ulke secimi yapilmasi")
    public void ulkeSecimiYapilmasi()
    {

        Select select =new Select(countrySelectPage.countryDropDown);
        select.selectByVisibleText("Turkey");

        countrySelectPage.countrySelectButton.click();

        String actualPageTitle = Driver.getDriver().getTitle().trim();
        Assert.assertTrue(actualPageTitle.equalsIgnoreCase("En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da"));

    }

    @When("Userin giris yap pageinde email girmesi")
    public void userinGirisYapPageindeEmailGirmesi()
    {
        //GIRIS YAP LINKININ UZERINE HOVER OVER YAP

        //1-> Classin icine gitmek icin obje/kapi olusturduk
        //2->Obje olusturmak icin defaultConstructor kullandik
        //3->Default constructor kullanirken, icindeki PageFactroty yapisini calisirmis olduk

        actions.pause(2000).moveToElement(homePage.girisYapLinkText).perform();


        //ACIGA CIKAN GIRIS YAP BUTTONUNA CLICK YAP
        actions.pause(1000).click(homePage.girisYapButonu).perform();


        //TURUNCU GIRIS YAP BUTTONU DISPLAYED MI ASSERT ET
        Assert.assertTrue(loginPage.girisFormuGirisYapButonu.isDisplayed());


        //EMAIL TEXTBOX'INA TESTSUITE'DEN GELEN PARAM'I GIR
        loginPage.girisFormuEmailTextBox.sendKeys("tdemailtestdata@gmail.com");

    }

    @And("Userin giris yap pageinde sifre girmesi")
    public void userinGirisYapPageindeSifreGirmesi() {
        //PASSWORD TEXTBOX'INA TESTSUITE'DEN GELEN PARAM'I GIR
        loginPage.girisFormuSifreTextBox.sendKeys("Trendyol123!");



    }

    @And("Userin turuncu giris yap butonuna click yapmasi")
    public void userinTuruncuGirisYapButonunaClickYapmasi() {
        loginPage.girisFormuGirisYapButonu.click();


    }

    @Then("Userin basarili bir sekilde giris yaptiginin verification edilmesi")
    public void userinBasariliBirSekildeGirisYaptigininVerificationEdilmesi() {

        //HESABIM LINKI MEVCUT OLANA KADAR BEKLE -SONRA HOVER OVER YAP
        WaitUtil.waitForVisibility(userHomePage.hesabim,2);
        actions.pause(1000).moveToElement(userHomePage.hesabim).perform();

        Assert.assertTrue(userHomePage.username.getText().equalsIgnoreCase("tdemailtestdata@gmail.com"));

    }

    @When("userin cikis yap butonuna tiklayarak accountdan log off olmasi")
    public void userinCikisYapButonunaTiklayarakAccountdanLogOffOlmasi()
    {
        //CLICK ON cikisYapButonu BUTTON
        userHomePage.cikisYapButonu.click();
    }

    @Then("user cikis yaptigina dair verification assertin yapar")
    public void userCikisYaptiginaDairVerificationAssertinYapar()
    {

        //DO ASSERTION FOR girisYapButonu  - BU WEB ELEMENTI 2 KEZ LOCATE ETTIK, DEMEKKI KOTU KOD YAZIYORUZ.
        WaitUtil.waitForVisibility(homePage.girisYapLinkText,4);
        Assert.assertTrue(homePage.girisYapLinkText.isDisplayed());

        Driver.closeDriver();
    }


    @Then("CucumberRunner dryRun kullanimini ogreniyorum")
    public void cucumber_runner_dry_run_kullanimini_ogreniyorum() {
        System.out.println("DRY RUN KULLANIMI SAYEINDE BU METHODU HAZIR ALDIM");
    }


}
