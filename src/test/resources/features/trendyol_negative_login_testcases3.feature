@US01
Feature: (Ozellik) TrendYol WebApp'inin login ozelliginin User story'si - (kullanicinin giris yapamama user storysi) - US01

  Background: Ortak ilk stepler
     #Given -> test case icin gerekli on sartlarin yapildigi methodlar
    Given Trendyol homepageine navigate edilmesi "https://www.trendyol.com/"
    #And-> Ustundeki turuncu gherkin dili keywordunun devami demektir
    And Ulke secimi yapilmasi "Turkey" ve pageTitle verification "En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da"


  @US01_TC01
  Scenario Outline: Trenyol User'in yanlis email ile login olmaya calismasi - testcase01 -TC01

    #When->userin webApp'te reaksiyon gosterdigi an
    When Userin giris yap pageinde email girmesi "<email>"
    And Userin giris yap pageinde sifre girmesi "<sifre>"
    And Userin turuncu giris yap butonuna click yapmasi ve cikan hata mesajini verify etmesi "<hataMesaji>"

    Examples: Her bir satir bir scenario icin calisir. satir sayisi=scenario sayisidir
    |email                        |sifre            |hataMesaji                                |
    |tdemailtestdata@gmail.comMMMM|Trendyol123!     |E-posta adresiniz ve/veya şifreniz hatalı.|
    |tdemailtestdata@gmail.com    |Trendyol123!!!!! |E-posta adresiniz ve/veya şifreniz hatalı.|
