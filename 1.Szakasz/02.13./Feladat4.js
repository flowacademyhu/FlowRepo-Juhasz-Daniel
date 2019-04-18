Hozzatok létre egy új repo-t a szokásos módon, lehet privát most! A neve legyen "Some algorithms"! 
A feladatotok lesz elkészíteni egy néhány egyszerű algoritmust! Hozzatok létre egy develop branchet is a master mellé! 
1. Tulajdonos feladatai:
 - Readme.md elkészítése "kézzel", azaz nem a git oldalán, hanem a gépeden. 
 - A továbbiakban ő is develop-on dolgozik, de a munka végeztével mergelnie kell a develop branchet a masterba. 
 - Készít egy "index.js" fájlt, amely a főprogram lesz. 
 - Amikor létrehozza a csapattag a Source modult, lepullolja azt!
 - Az index.js fájlban meghívja ezt a prímtesztelő függvényt 12 paraméterrel, és kiírja az eredményt! Miután ez kész, pusholja developra!
 - Módosítja a prímtesztelő függvényt oly módon, hogy a változókat átnevezi véletlenszerűen! (Persze működjön :) ) (Don't forget to commit&push) :)
 - Készít egy "arrayDiff" függvényt, amely egy számokat tároló tömböt kap paraméterül, és megkeresi a legnagyobb különbséget a számok között. Például [1, 2, 3, 4] tömbre az eredmény 3, mert a legnagyobb különbség 3 a 4 és az 1 miatt
Ha a csapattag is végzett, mergelhet minden a masterra. 

2. Csapattag feladatai:
 - Develop branchen dolgozik. 
 - Készítse el a "Source" modul vázát, azaz magát a fájlt, és egy "isPrime" függvényt, amely egy pozitív egész számot vár paraméterül, és logikai értékkel tér vissza az alapján, hogy a paraméterül kapott szám prím-e. Elég a sima oszthatóság tesztelős módszert alkalmazni.
 - Készít egy "isDivisibleBy3" függvényt, amely egyszerű módon a paraméterül kapott számról eldönti, hogy osztható-e hárommal! (Tényleg csak 1-2 sor :))
 - Módosítja a prímtesztelő függvényt oly módon, hogy a változókat átnevezi véletlenszerűen! (Persze működjön :) ) (Don't forget to commit&push) :)
 - Módosítja az index.js-ben a prímtesztelő függvény hívását oly módon, hogy az egy véletlenszerűen generált számot használjon! 
 - Készít egy "firstNPrime" függvényt, amelynek egy N számot vár paraméterül, és az első N prímszámból álló tömböt adja vissza! Nyugodtan használható az isPrime függvény! Ezt végül hívja is meg az index.js-ben 15-ös paraméterrel, eredményét jelenítse meg konzolon!
