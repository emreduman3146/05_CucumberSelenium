package io.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class HomePage extends ParentPage
{
    //CACHE BELLEK NE DEMEKTIR ANALAYALIM, LUTFEN BU YAZIYI OKUYALIM ARKADASLAR
    //https://www.webtekno.com/cache-nedir-h99461.html


    @FindBy(xpath = "//p[text()='Giriş Yap']")
    public WebElement girisYapLinkText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='login-button']")
    public WebElement girisYapButonu;


    /*
        @CacheLookUp anotasyonu Selenium'da, web element'i önbellekte saklar,
        böylece her kullanıldığında elementi aramak zorunda kalmaz.
        Ancak, bu anotasyonu kullanarak doğrudan önbellekte saklanan web elementlerini görmek mümkün değildir.

        @CacheLookup anotasyonu sadece,
        her kullanıldığında elementi aramak için harcanan zamanı azaltarak kodun çalışma performansını arttırmakta
        fakat ön bellekte saklanan elementleri gözlemlemene izin vermemektedir.
     */






}
