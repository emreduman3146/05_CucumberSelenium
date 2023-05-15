package io.cucumber.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.utilities.PageObjectUtil;
import io.cucumber.utilities.WaitUtil;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;


public class MyStepdefs4_DataTable_Ogreniyorum {


    @Given("Arama sonucu sayfasinda filtreleme yapilmasi{int}")
    public void aramaSonucuSayfasindaFiltrelemeYapilmasi(int arg0, DataTable dataTable) {

        Map<String, String> filters=dataTable.asMap(String.class, String.class);

        filters.forEach((key, value) -> {
            System.out.println("Key: " + key + " Value: " + value);
        });
    }

    @Given("Arama sonucu sayfasinda filtreleme yapilmasiiiii")
    public void aramaSonucuSayfasindaFiltrelemeYapilmasiiii(Map<String,List<String>> datatable) {


        datatable.forEach((key, value) -> {
            System.out.println("Key: " + key + " Value: " + value);
        });
    }

    @Given("Arama sonucu sayfasinda filtreleme yapilmasiiiiizz")
    public void aramaSonucuSayfasindaFiltrelemeYapilmasiiiiizz(List<List<String>> datatable) {
        datatable.forEach(System.out::println);
    }

    @Given("Arama sonucu sayfasinda filtreleme yapilmasiiiiizzaa")
    public void
    aramaSonucuSayfasindaFiltrelemeYapilmasiiiiizzaa(List<Map<String, String>> dataTable) {
        for (Map<String, String> filter : dataTable) {
            System.out.printf
                    (
                            "%s, %s, %s,%s, %s %n",
                            filter.get("Cinsiyet"),
                            filter.get("marka"),
                            filter.get("size"),
                            filter.get("color"),
                            filter.get("price")
                    );
        }
    }


    @Given("the following historic Derby d'Italia results")
    public void the_following_historic_derby_dItalia_results(Map<String, Map<String, Integer>> results) {
        results.forEach((date, scores) ->
                System.out.printf(
                        "The final score of the Derby d'Italia played on %s was Internazionale %d, Juventus %d%n",
                        date,
                        scores.get("Internazionale"),
                        scores.get("Juventus")
                )
        );
    }

    @Given("Arama motoruna {string} yazip {string} tiklanmasi")
    public void aramaMotorunaYazipTiklanmasi(String arg0, String arg1) {
    }
}
