@US02
Feature: TrendYol WebApp'inin login ozelliginin User storysi US02


  @TC01
  Scenario: Trenyol Userin GMAIL SIFRE girerek login olmasi test case
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

