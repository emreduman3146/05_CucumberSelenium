@UserStory01
Feature: Login to E-commerce Trendyol WebApplication
  As a customer
  I want to be able to login to the website
  So that I can access my account


  @US01_TestCase01
  Scenario: The customer uses valid credentials to login the account
    #Given -> test case icin gerekli on sartlarin yapildigi methodlar
    Given Trendyol homepageine navigate edilmesi
    #And-> Ustundeki turuncu gherkin dili keywordunun devami demektir
    And Ulke secimi yapilmasi

    #When->userin webApp'te reaksiyon gosterdigi an
    When Userin giris yap pageinde email girmesi
    And Userin giris yap pageinde sifre girmesi
    And Userin turuncu giris yap butonuna click yapmasi


    #Then->Kullanicin verification(kiyas-dogrulama) yapacagi methodlardir
    Then Userin basarili bir sekilde giris yaptiginin verification edilmesi

    When userin cikis yap butonuna tiklayarak accountdan log off olmasi

    Then user cikis yaptigina dair verification assertin yapar



