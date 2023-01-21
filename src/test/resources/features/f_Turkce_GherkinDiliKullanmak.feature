# language: tr
@US02_tablo
Özellik: Trenyol e-ticaret uygulamasina basarisiz giris yapma girisimi
  Bir musteri olarak
  Yanlis bilgilerle hesaba giris yapilamamasi gerekmektedir.

  Geçmiş: Musteri anasayfaya gider
    Diyelim ki Trendyol homepageine navigate edilmesi "https://www.trendyol.com/"
    Ve Ulke secimi yapilmasi "Turkey" ve pageTitle verification "En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da"


  @US02_taslak_TC01_TC02
  Senaryo taslağı: Musteri gecerli olmayan birbirinden farkli bilgiler kullanir

    Eğer ki Userin giris yap pageinde email girmesi "<eposta>"
    Ve Userin giris yap pageinde sifre girmesi "<sifre>"
    O zaman Userin turuncu giris yap butonuna click yapmasi ve cikan hata mesajini verify etmesi "<hataMesaji>"
    Fakat Hata mesaji boyle olmamali "<beklenmeyenMesaj>"

    @US02_tablo_TC01_TC02
    Örnekler: Her senaryo taslagi icin kullanilacak gerekli test verileri
      | eposta                        | sifre            | hataMesaji                                 | beklenmeyenMesaj                           |
      | tdemailtestdata@gmail.comMMnn | Trendyol123      | E-posta adresiniz ve/veya şifreniz hatalı. | Lütfen geçerli bir e-posta adresi giriniz. |
      | tdemailtestdata@gmail.com     | Trendyol123!!!!! | E-posta adresiniz ve/veya şifreniz hatalı. | Lütfen geçerli bir e-posta adresi giriniz. |

#https://cucumber.io/docs/gherkin/languages/