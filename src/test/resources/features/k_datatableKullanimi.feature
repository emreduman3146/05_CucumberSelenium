@SearchItem
Feature: Login to E-commerce Trendyol WebApplication
  As a customer
  I want to be able to login to the website
  So that I can access my account

  @US01_TestCase01_params
  Scenario: The customer uses valid credentials to login the account
    Given Trendyol homepageine navigate edilmesi "https://www.trendyol.com/"
    And Ulke secimi yapilmasi "Turkey" ve pageTitle verification "En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da"
    When Userin giris yap pageinde email girmesi "tdemailtestdata@gmail.com"
    And Userin giris yap pageinde sifre girmesi "Trendyol123!"
    And Userin turuncu giris yap butonuna click yapmasi
    Then Userin basarili bir sekilde giris yaptiginin verification edilmesi "tdemailtestdata@gmail.com"


  @Filtre_A_Product
  Scenario:The customer apply a filtre to search an item
    Given Arama motoruna "Ayakkabı" yazip aramaButonu tiklanmasi
    When Arama sonucu sayfasinda filtreleme yapilmasi
      | Cinsiyet |  Marka    |Size|
      | Kadın    |  Nike     |30  |
      | Erkek    |  Puma     |40  |
      | Erkek    |  Adidas   |44  |
      | Kadin    |  Reebok   |36  |
    And Arama sonuclarından rastgele bir urun secılmesı
    Then Urun detaylarının dogrulanması
      | Nike  |  36   | Beyaz|  900 TL - 1500 TL |


  #@Filtre_A_Product
  #Scenario:The customer apply a filtre to search an item
   # Given Arama motoruna "Ayakkabı" yazilip aranmasi
   # Given Arama sonucu sayfasinda filtreleme yapilmasi
    #  | İlgili Kategoriler                | Cinsiyet |  Marka | Beden       | Renk        | Fiyat            |
     # | Spor Ayakkabi, Yürüyüş Ayakkabısı | Kadın    |  Nike  | 36,37,38    | Beyaz,Siyah | 900 TL - 1500 TL |
    #When Arama sonuclarından rastgele bir urun secılmesı
    #Then Urun detaylarının dogrulanması
     # | Nike  |  36   | Beyaz|  900 TL - 1500 TL |





