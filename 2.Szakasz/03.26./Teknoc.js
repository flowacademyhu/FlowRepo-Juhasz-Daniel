Készítsünk egy egyszerű Commenius Logo programot. Ehhez a következőkre lesz szükség:
1. Turtle osztály, mely a teknőcöt valósítja meg. Legyen két egész számot tároló adattagja a pozíciójára, továbbá egy logikai adattag, mely a toll állapotát reprezentálja, valamint a pálya méreteit is tárold le (két irányban)!
- Készíts neki konstruktort, ami a koordinátákat 0,0-ra állítja be, továbbá a toll false állapotra kerül, és paraméterként megkapja a pálya méretét!
- Legyen a teknőcnek egy move függvénye, mely egy Stringet vár paraméterként, ez lesz az irány, amerre lépni kell, és térjen vissza logikai értékkel annak megfelelően, hogy az adott irány nem mutat-e túl a pálya határain! A lépést végezze is el, azaz a koordinátáit módosítsa megfelelően! (Irányok: LE, FEL, JOBBRA, BALRA)
- Legyen egy changePen függvénye, mely a toll állapotát változtatja a paraméterben kapottnak megfelelően! Ez gyakorlatilag egy setter függvény :)
- Legyen a teknőcnek toString függvénye, amely az adattagokat adja vissza igényes formában!
2. Map osztály, mely egy két dimenziós char tömböt fog tárolni, és ez végzi a rajzolást. Tároljon továbbá egy Turtle objektumot is! 
- Készíts konstruktort, amely két számot vár, és ez alapján létrehozza a tömböt, továbbá példányosítja a Turtle objektumot a megfelelő adatokkal! A tömb 0,0 pozíciójára helyezd is el a '$' karaktert, ez lesz a teknőc!
- Legyen egy drawMap függvénye, mely kirajzolja a konzolra a karaktertömböt!
- Legyen egy doCommand függvénye, mely egy Stringet vár! Ez a String lesz az utasítás, amit a teknőcnek végre kell hajtania! 
Az utasítások a következők lehetnek:
TOLLAT LE
TOLLAT FEL
LE x
FEL x
JOBBRA x
BALRA x
TÖRÖL
x egy szám.
A töröl utasítás kitörli a tömbből a # karaktereket, azaz, amit rajzolt a teknőc, de őt magát természetesen rajta hagyja a táblán.

A doCommand függvény hajtsa végre a megfelelő utasítást! Segítség: ellenőrizd, hogy kell-e rajzolni, és ha igen, akkor minden lépésben mentsd el a teknőc koordinátáit a lépése előtt, hogy oda tehess egy '#' karaktert! Használj ciklust a lépések darabszáma miatt! 
3. Készíts egy Main osztályt, melyben a program belépési pontja lesz! Ebben példányosíts egy Scannert, továbbá egy Map példányt! Készíts egy while ciklust, mely addig fut, amíg a felhasználó nem írja be a "KILÉP" szöveget! A ciklusmagban hívd meg a map osztály doCommand függvényét a bemeneten kapott String-el, továbbá rajzoltasd ki a táblát a drawMap függvénnyel!
-----------------
További lehetőség [hardcore]:
Új utasítás:
- TANULD függvénynév
- VÉGE
- CSINÁLD függvénynév
A cél a teknőcöt megtanítani függvények használatára. Ehhez hozz létre TurtleFunction osztályt, amely egy String listát tárol, továbbá van egy neve. Legyen konstruktora, és egy addCommand metódusa, mely egy Stringet vár, és hozzáadja az utasítások listájához. Legyenek továbbá getter függvényei. A Map osztály legyen képes ezen objektumok tárolására szintén listában. Kezeld le a Map osztály doCommand függvényében a fenti utasításokat. Készíts egy függvény overload-ot a doCommand függvényre, mely egy String listát vár, és a listában lévő utasításokat hajtja végre. 
