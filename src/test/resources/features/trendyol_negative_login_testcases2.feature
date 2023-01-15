@US01
Feature: (Ozellik) TrendYol WebApp'inin login ozelliginin User story'si - (kullanicinin giris yapamama user storysi) - US01

  Background: Ortak ilk stepler
     #Given -> test case icin gerekli on sartlarin yapildigi methodlar
    Given Trendyol homepageine navigate edilmesi "https://www.trendyol.com/"
    #And-> Ustundeki turuncu gherkin dili keywordunun devami demektir
    And Ulke secimi yapilmasi "Turkey" ve pageTitle verification "En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da"



  @US01_TC01
  Scenario: Trenyol User'in yanlis email ile login olmaya calismasi - testcase01 -TC01

    #When->userin webApp'te reaksiyon gosterdigi an
    When Userin giris yap pageinde email girmesi "tdemailtestdata@gmail.comMMMM"
    And Userin giris yap pageinde sifre girmesi "Trendyol123!"
    And Userin turuncu giris yap butonuna click yapmasi ve cikan hata mesajini verify etmesi "E-posta adresiniz ve/veya şifreniz hatalı."



  @US01_TC02
  Scenario: Trenyol User'in yanlis sifre ile login olmaya calismasi - testcase02 - TC02

    #When->userin webApp'te reaksiyon gosterdigi an
    When Userin giris yap pageinde email girmesi "tdemailtestdata@gmail.com"
    And Userin giris yap pageinde sifre girmesi "Trendyol123!!!!!!!!"
    And Userin turuncu giris yap butonuna click yapmasi ve cikan hata mesajini verify etmesi "E-posta adresiniz ve/veya şifreniz hatalı."

