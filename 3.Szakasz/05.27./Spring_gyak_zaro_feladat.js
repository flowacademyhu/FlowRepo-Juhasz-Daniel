- A feladat egy nagyon egyszerű licitálós alkalmazás megvalósítása (kb. mint a Vatera, csak nagyon lezanzásítva).

1. Generáljunk ki egy projektet bider néven Spring Initializr-rel! Külön mappába inicializáljuk, és toljuk fel gitre!

2. Importáljuk a projektet IntelliJ-be! Húzzuk be a dependency-ket: szükségünk lesz JPA-ra, Spring web-re!

3. Készítsünk egy adatbázis pgAdmin-ban, és persze hozzá egy role-t, minden engedéllyel!

4. Konfiguráljuk be az alkalmazásunkat yml használatával!

5. Készítsük el az entitásokat! 

  a. Szükség lesz egy Product entitásra, ami az árukat reprezentálja. Tároljunk el egy id-t, ami egy számérték (tehát generáljuk), a termék nevét, leírását, minimál árát, hogy mikor lett hozzáadva az áru, illetve hogy meddig fogadunk liciteket az adott árura!

  b. Kell továbbá egy Bid entitás, ami a leadott liciteket reprezentálja. Róluk el kell tárolni egy generált számtípusú id-t, egy meglicitált árat, egy nevet, amit az egyszerűség kedvéért most mi adunk meg, illetve, hogy mikor adtuk le a licitet.

  d. Implementáljuk az entitások közötti kapcsolatokat is! Kétirányúan kapcsolódhat egy Product-hoz több Bid.

  e. Generáljuk le a táblákat az adatbázisba ezek alapján egy szerverindítással.

  f. Töltsük fel a tábláinkat tesztadatokkal!

    (++) i. Egy CSV fájlból olvassuk be az adatokat, és úgy mentsük le az egyes tételeket!

6. Készítsük el a Repository és a Service réteget, az alapvető CRUD műveleteket implementáljuk, Transactional-re figyelve. Ezek után készítsük el hozzájuk az egyes REST-eket!

7. Egészítsük ki az egyes funkcionalitásokat az alábbiakban leírtak szerint! Ügyeljünk az egyes rétegek kovencióira.

  a. Tudjuk listázni a termékeket!

  b. Legyünk képesek egy-egy termékhez licit tételt felvenni! Ennek a mentésekor figyelnünk kell azt, hogy lejárt-e már a termékre a licit, illetve, hogy ne tudjunk megadni kevesebbet, mint a minimálár! Kedvezőtlen esetben validációs hibával szálljunk el!

    (++) i. Figyeljük azt is, hogy az adott termékhez tartozó többi licit ármaximumjánál ne tudjunk kevesebbet megadni!

  c. Az előbbi ellenőrzések legyenek érvényesek update esetén is!

  d. Törölni csak abban az esetben tudjunk licit tételt, ha nem tartozik hozzá termék! Ellenkező esetben hibaüzenet.

  e. Tudjuk listázni az adott termékhez tartozó liciteket úgy, hogy ár szerint növekvő sorrendben tesszük azt!

8. Implementáljunk teszteseteket az egyes rétegekhez! Először sima unit teszteket, később lehet integrációs teszteket is! (Ezt a részt hagyhatjuk a feladatmegoldás végére is).

(++) 9. Generáljunk ki egy angular-os alkalmazást! Konfiguráljuk be backenden hozzá a CORS-t. A design jelenleg nem fontos, sokadlagos szempont.

(++) 10. Az angular-os alkalmazásnak két oldala legyen. Az egyiken a termékeket tudjuk listázni, a másikon a termék id-ja alapján a terméket, illetve a termékhez tartozó liciteket! Ehhez serviceket és komponenseket értelemszerűen készítsünk!

(++) 11. Készítsünk egy harmadik oldalt is, ahol egy adott termékhez tudunk egy licit tételt felvenni!

NOTE: Akinek szerda délutánig sikerül mindezeket - a plusz feladatokkal együtt - megcsinálni, annak kettő doboz nagyon finom lengyel Żubr sört ajánlok fel.