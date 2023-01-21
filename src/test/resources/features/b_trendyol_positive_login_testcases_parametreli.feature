@UserStory01_params
Feature: Login to E-commerce Trendyol WebApplication
  As a customer
  I want to be able to login to the website
  So that I can access my account

  @US01_TestCase01_params
  Scenario: The customer uses valid credentials to login the account
    #Given -> test case icin gerekli on sartlarin yapildigi methodlar
    Given Trendyol homepageine navigate edilmesi "https://www.trendyol.com/"
    #And-> Ustundeki turuncu gherkin dili keywordunun devami demektir
    And Ulke secimi yapilmasi "Turkey" ve pageTitle verification "En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da"

    #When->userin webApp'te reaksiyon gosterdigi an
    When Userin giris yap pageinde email girmesi "tdemailtestdata@gmail.com"
    And Userin giris yap pageinde sifre girmesi "Trendyol123!"
    And Userin turuncu giris yap butonuna click yapmasi


    #Then->Kullanicin verification(kiyas-dogrulama) yapacagi methodlardir
    Then Userin basarili bir sekilde giris yaptiginin verification edilmesi "tdemailtestdata@gmail.com"

    When userin cikis yap butonuna tiklayarak accountdan log off olmasi

    Then user cikis yaptigina dair verification assertin yapar

# language: tr
