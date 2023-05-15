@SearchItem2
Feature: Login to E-commerce Trendyol WebApplication
  As a customer
  I want to be able to login to the website
  So that I can access my account

  Scenario:datatable
    Given Arama sonucu sayfasinda filtreleme yapilmasi
      | Filtre1    |  NB |29|
      | Filtre2    |  Nike  |30  |
      | Filtre3    |  Puma  |  31  |
      | Filtre4    |  Adidas  |32 |



    Given Arama sonucu sayfasinda filtreleme yapilmasi2
      | Cinsiyet |  marka |
      | Kadin    |  Nike  |
      | Erkek    |  Puma  |

    Given Arama sonucu sayfasinda filtreleme yapilmasiiiii
      |Fitre1| Kadin    |  Nike  |30|siyah|1000-1500|
      |Filtre2| Erkek    |  Puma  |32|beyaz|2000-3000|

    Given Arama sonucu sayfasinda filtreleme yapilmasiiiiizz
      | Kadin    |  Nike  |30|siyah|1000-1500|
      | Erkek    |  Puma  |32|beyaz|2000-3000|

    Given Arama sonucu sayfasinda filtreleme yapilmasiiiiizzaa
      |Cinsiyet|marka|size|color|price|
      | Kadin    |  Nike  |30|siyah|1000-1500|
      | Erkek    |  Puma  |32|  |2000-3000|
      | Erkek    |  Adidas  |33|pink|500-1000|



    Given the following historic Derby d'Italia results
      |            | Internazionale | Juventus |
      | 17-01-2021 | 2              | 0        |
      | 08-03-2020 | 0              | 2        |
      | 06-10-2019 | 1              | 2        |

