- A feladat egy sematikus autóflotta-kezelő alkalmazás implementálása.

1. Generáljunk ki egy projektet carsharing néven Spring Initializr-rel! Külön mappába inicializáljuk, és toljuk fel gitre!

2. Importáljuk a projektet IntelliJ-be! Húzzuk be a dependency-ket: szükségünk lesz JPA-ra, Spring web-re!

3. Készítsünk egy adatbázis pgAdmin-ban, és persze hozzá egy role-t, minden engedéllyel!

4. Konfiguráljuk be az alkalmazásunkat yml használatával!

5. Készítsük el az entitásokat! 

  a. Szükség lesz egy Car entitásra, ami az autóinkat reprezentálja. Tároljuk el a rendszámukat (legyen ez az id), márkájukat, típusukat, évjáratukat, illetve a forgalmi vizsgájuk lejárati dátumát (az egyszerűség kedvéért itt érdemes LocalDate-et használni, java.util package).

  b. Kell továbbá egy Driver entitás, ami a sofőröket jeleníti meg. Róluk el kell tárolni egy login nevet (legyen ez az id), jelszót, a teljes nevüket, a jogosítványuk lejárati dátumát (LocalDate), és hogy aktívak-e jelenleg.

  c. Kell még egy Reservation entitás, ami az autók lefoglalását reprezentálja. Tároljuk a foglalás id-ját, leadásának időpontját (LocalDateTime), a foglalás kezdeti dátumát (LocalDate), a foglalás végdátumát (LocalDate), egy úticél leírást, azt, hogy melyik autó van lefoglalva, illetve hogy melyik sofőr foglalta le az autót.

  d. Implementáljuk az entitások közötti kapcsolatokat is! Kétirányúan kapcsolódhat egy Car-hoz több Reservation, illetve egyirányúan kapcsolódjon egy Car/Reservation-höz egy-egy Driver, ManyToOne-nal.

  e. Generáljuk le a táblákat az adatbázisba ezek alapján egy szerverindítással.

  f. Töltsük fel a tábláinkat tesztadatokkal!

6. Készítsük el a Repository és a Service réteget, az alapvető CRUD műveleteket implementáljuk, Transactional-re figyelve. Ezek után készítsük el hozzájuk az egyes REST-eket!

7. Adjunk néhány funkcionalitást az alkalmazásunkhoz! Ügyeljünk az egyes rétegek kovencióira.

  a. Tudjon az alkalmazás autóhoz sofőrt rendelni! Két id-t küldjünk fel, a sofőrét és az autóét. Ezek alapján egy update-tel végezzük el az összerendelést. Figyeljük azt, hogy az autónak érvényes-e a műszakija, illetve hogy a sofőrnek nem járt-e még le a jogosítványa! Ha ez a kettő együtt áll, csak akkor tudjuk elvégezni az összerendelést! Egyébként térjünk vissza hibával!

  b. Tudjunk úgy autót felvenni, hogy már alapból hozzárendelünk egy sofőrt (hint: Transient mezővel megoldható). Itt is figyeljük az előző pontban leírt kritériumokat, és járjunk el ennek megfelelően!

  c. A foglalás hozzáadást úgy bővítsük ki, hogy figyeljünk az alábbiakra:

    i. Ha adott időszakban adott autóra már létezik foglalás, szálljunk el hibával! Ezen felül persze figyeljük a jogsi lejáratot és a műszaki lejáratot is!

  d. Ezek az ellenőrzések legyenek érvényesek update esetén is!

  e. Törölni csak abban az esetben tudjunk autót vagy sofőrt, ha nem tartozik hozzá érvényes foglalás! Ellenkező esetben hibaüzenet.

  f. Legyünk képesek listázni az autóinkat a következők alapján:

    i. Adott sofőrhöz tartozó autó, érvényes műszakijú autók, adott márkájú/típusú autók.

  g. Tudjuk listázni a foglalásokat a következők alapján:

    i. Adott sofőr alapján, autó alapján, foglalási intervallum alapján (hogy beleesik-e a megadott intervallumba).

8. Implementáljunk teszteseteket az egyes rétegekhez!
