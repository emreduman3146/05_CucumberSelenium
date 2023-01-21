package io.cucumber.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.math.BigInteger;

public class MyStepdefs3_GherkinDili {


    @Given("Benim {} tane {} var")
    public void benimTaneVar(long adet, String nesne) {

        System.out.println("Benim" + adet + " tane" + nesne + " var!");

        //JAVA BILGISI
        //StringFormat ve printf() konulari haftaici calisilabilir.
        System.out.printf("Benim %d tane %s var", adet, nesne);
    }



    @Given("Kitabin adi {}")
    public void kitabinAdi(String arg0) {
        System.out.println(arg0);
    }


    //feature file'da yazilan int veriler icin
    //{byte} {short} {int} {long} {biginteger}

    //feature file'da yazilan kusuratli veriler icin
    //{float} {double}

    //String veriler icin {word} {string}

    //Tek kelimeden olusan string icin {word}

    //anonymous verier icin {}
    //ister sayi ister yazi gonder olur





    @Given("There is/are {int} item(s)/product(s) in the cart/basket")
    public void thereIsItemInTheCart(int arg0) {
    }



    @When("I/He/She click(s) on/at/in the button/textbox/checkbox/radiobutton")
    public void iClickOnTheButton() {
        System.out.println("Done");
    }









    @Then("I see this tshirt as (gr.y)")
    public void iSeeThisTshirtAsGrey() {

    }

    @Then("Bugun hava (co*k) guzel")
    public void bugunHavaCooooooooooookGuzel() {
    }


    @Given("Pi sayisi {} alinmalidir")
    public void piSayisiAlinmalidir(float d) {
        System.out.println(d);
    }

    @Given("Programlama ogreniyorum ve {string} yazabiliyorum.")
    public void programlamaOgreniyorumVeWorldYazabiliyorum(String arg0) {
        System.out.println(arg0);
    }


    @And("Programlama ogreniyorummmmmbbbbbbbbbmm ve {string} yazabiliyorum.")
    public void programlamaOgreniyorummmmmbbbbbbbbbmmVeYazabiliyorum(String arg0) {
        System.out.println(arg0);
    }

    @Given("Sepete eklenen urunleri goruntule\\(bir onceki testcase'de eklenmistiler)")
    public void sepeteEklenenUrunleriGoruntuleBirOncekiTestcaseDeEklenmistiler() {
        System.out.println("ozel karakterleri deniyoruz");
    }


    @Given("Havuzdaki suyun {int}% si buharlasmis")
    public void havuzdakiSuyunSiBuharlasmis(int arg0) {
        System.out.println(arg0);
    }

    @Given("Bir cikolata ${double}")
    public void birCikolata$(double fiyat) {
        System.out.println(fiyat);
    }
}
