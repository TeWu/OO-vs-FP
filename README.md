Zadanie
============
Zaimplementować poniższe wymagania korzystając z dwóch paradygmatów programowania:
  * Zorientowanego Obiektowo  (OO)
    * Klasy i obiekty - Dane i zachowania trzymane razem
    * Klasy abstrakcyjne - Definiujące interfejs, ale bez konkretnej implementacji
    * Hierarchie dziedziczenia klas - "Subtype Polymorphism"
  * Funkcyjnego  (FP)
    * Algebraiczne typy danych
    * Typy wyższego rodzaju
    * Typeclassy - "Ad hoc Polymorphism"


Wymagania
============

  * Człowiek może być dzieckiem lub dorosłym.
  * Dorosły może być studentem lub profesorem.

  * Człowiek może mówić. Każdy rodzaj człowieka (dziecko, student i profesor) mówi coś innego.
    * OO -> Zdefiniować metodę "say" dla człowieka
    * FP -> Zdefiniować funkcję "say", do której można przekazać człowieka

  * Dorosły człowiek może myśleć. Student myśli coś innego niż profesor.
  * Dziecko nie może myśleć.

  * Student może grać.
  * Dziecko i profesor nie mogą grać.

  * Profesor może myśleć intensywnie.
  * Dziecko i student nie mogą myśleć intensywnie.


**Program, który nie spełnia powyższych wymagań, powinien zwracać błąd już na etapie kompilacji.**
