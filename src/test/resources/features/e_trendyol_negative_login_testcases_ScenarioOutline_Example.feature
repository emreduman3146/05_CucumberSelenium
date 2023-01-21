@US02_table
Feature: Login to E-commerce Trendyol WebApplication
  As a customer
  I should not login to the website with invalid credentials

  Background: The customer navigates to the homePage
     #Given -> test case icin gerekli on sartlarin yapildigi methodlar
    Given Trendyol homepageine navigate edilmesi "https://www.trendyol.com/"
    #And-> Ustundeki turuncu gherkin dili keywordunun devami demektir
    And Ulke secimi yapilmasi "Turkey" ve pageTitle verification "En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da"


  @US02_outline_TC01_TC02
  Scenario Outline: 01- The customer uses different invalid credentials to login the account

    #When->userin webApp'te reaksiyon gosterdigi an
    When Userin giris yap pageinde email girmesi "<email>"
    And Userin giris yap pageinde sifre girmesi "<password>"
    Then Userin turuncu giris yap butonuna click yapmasi ve cikan hata mesajini verify etmesi "<errorMessage>"
    But Hata mesaji boyle olmamali "<unexpectedErrorMessage>"

    @US02_table_TC01_TC02
    Examples: Testdata for scenarios
      | email                         | password         | errorMessage                               | unexpectedErrorMessage                     |
      | tdemailtestdata@gmail.comMMnn | Trendyol123      | E-posta adresiniz ve/veya şifreniz hatalı. | Lütfen geçerli bir e-posta adresi giriniz. |
      | tdemailtestdata@gmail.com     | Trendyol123!!!!! | E-posta adresiniz ve/veya şifreniz hatalı. | Lütfen geçerli bir e-posta adresi giriniz. |

