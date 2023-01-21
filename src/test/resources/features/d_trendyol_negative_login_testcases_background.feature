@US02_background
Feature: Login to E-commerce Trendyol WebApplication
  As a customer
  I should not login to the website with invalid credentials

  Background: The customer navigates to the homePage
     #Given -> test case icin gerekli on sartlarin yapildigi methodlar
    Given Trendyol homepageine navigate edilmesi "https://www.trendyol.com/"
    #And-> Ustundeki turuncu gherkin dili keywordunun devami demektir
    And Ulke secimi yapilmasi "Turkey" ve pageTitle verification "En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da"



  @US02_background_TC01
  Scenario: The customer uses invalid email to login the account

    #When->userin webApp'te reaksiyon gosterdigi an
    When Userin giris yap pageinde email girmesi "tdemailtestdata@gmail.comMMMM"
    And Userin giris yap pageinde sifre girmesi "Trendyol123!"
    Then Userin turuncu giris yap butonuna click yapmasi ve cikan hata mesajini verify etmesi "E-posta adresiniz ve/veya şifreniz hatalı."
    But Hata mesaji boyle olmamali "Lütfen geçerli bir e-posta adresi giriniz."



  @US02_background_TC01
  @US02_background_TC02
  Scenario: The customer uses invalid password to login the account

    #When->userin webApp'te reaksiyon gosterdigi an
    When Userin giris yap pageinde email girmesi "tdemailtestdata@gmail.com"
    And Userin giris yap pageinde sifre girmesi "Trendyol123!!!!!!!!"
    Then Userin turuncu giris yap butonuna click yapmasi ve cikan hata mesajini verify etmesi "E-posta adresiniz ve/veya şifreniz hatalı."
    But Hata mesaji boyle olmamali "Lütfen geçerli bir e-posta adresi giriniz."


