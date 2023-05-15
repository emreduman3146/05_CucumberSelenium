package io.cucumber.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.utilities.WaitUtil;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static io.cucumber.driver.Driver.getDriver;
import static io.cucumber.utilities.PageObjectUtil.*;


public class MyStepdefs4_DataTable{

    @Given("Arama motoruna {string} yazip aramaButonu tiklanmasi")
    public void aramaMotorunaYazipTiklanmasi(String text)
    {
        userHomePage.aramaMotoru.sendKeys(text, Keys.ENTER);
        WaitUtil.waitForClickablility(userHomePage.filtreMenusu, 5);
        getDriver().navigate().refresh();

    }

    @Given("Arama sonucu sayfasinda filtreleme yapilmasi")
    public void aramaSonucuSayfasindaFiltrelemeYapilmasi(List<Map<String, String>> filters) {


        for (Map<String, String> map : filters)
        {
            for(Map.Entry<String,String> key_value:map.entrySet())
            {
               // applyTheFilter(key_value);
            }
        }

        userHomePage.filtre.click();



        //div[@class="aggrgtn-cntnr-wrppr"]//div[.='İlgili Kategoriler']
    }

    private void applyTheFilter(Map.Entry<String, String> key_value)
    {
        switch (key_value.getKey())
        {
            case "Cinsiyet":

            case "Marka":
            case "Beden":
            case "Renk":
            case "Fiyat":
        }
    }


    @When("Arama sonuclarından rastgele bir urun secılmesı")
    public void aramaSonuclarındanRastgeleBirUrunSecılmesı() {

    }
    @Then("Urun detaylarının dogrulanması")
    public void urunDetaylarınınDogrulanması(DataTable dataTable) {

    }



}
