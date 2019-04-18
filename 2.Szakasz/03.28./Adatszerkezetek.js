Java adatszerkezetek gyakorló
Listák - feladat
Készíts egy programot, mely parancssori argumentumból vár számokat (args tömb). Ezeket olvasd be egy számokat tároló listába! (Elég egy Main osztályban dolgozni)
 - Készíts statikus metódust amely egy számokat tároló listát vár, és kiírja azt a konzolra igényes formában! (pl: 1, 2, 5, 56, 10) 
 - Készíts statikus metódust, mely egy számokat tároló listát, és egy számot vár, és logikai értékkel tér vissza, annak függvényében, hogy a lista tartalmazza-e a számot! (Használd a lista függvényeit!)
 - Készíts statikus metódust, mely egy számokat tároló listát, és kitörli a listából a páros számokat! A törlésre használd a lista megfelelő függvényét!
 - Kérj be a felhasználótól 3 darab számot, ezeket helyezd el egy másik listában! Vizsgáld meg, hogy a felhasználó által adott számok mind szerepelnek-e az első listában! (Írd ki az eredményt konzolra, valamint használd a beépített függvényeket!)
 - Az eddig létrehozott függvényeket hívd meg a main-ből, ellenőrzid a kimenetet!
 Halmaz - feladat
 - Készíts egy új programot, melynek main függvényében kérj be a felhasználótól számokat (Scanner) (5 darabot)!
 - Példányosíts egy HashSet objektumot egész számok tárolására, és helyezd bele a beolvasott számokat!
 - Írasd ki a halmazt (van toStringje rendes, így elég meghívni a println-ben), próbáld ki, mi történik, ha több megegyező elemet teszel bele!
 Map - feladat
 - Készíts egy programot, mely példányosít egy HashMap-et, melyben Integer kulcs és String érték lehetséges! Olvass be a konzolról Stringeket, mely formátuma a következő: Józsi 11 - Az első adat egy név, a második egy ID. Helyezd el a HashMap-ben a sorok adatait! 
 - Kérj be a felhasználótól egy ID-t (számot), és írd ki, hogy az adott felhasználó szerepel-e a map-ben! 
 - Írasd ki a kulcs-érték párokat konzolra!
 
 
 Fa feladat - [szorgalmi feladat]
 A feladat egy saját bináris keresőfa készítése. Ha még nem hallottál róla, nézz utána, hogy pontosan hogy is működik! 
Szükség lesz egy Node osztályra, mely a fa egy csúcsát jelenti. A Node tárolja a két gyermekét (szintén Node objektumok), valamint egy szám értéket. Készíts konstruktort, getter-setter függvényeket!
 Legyen egy Tree osztály, amely a fát valósítja meg. Ez tárolja a root Node-ot, azaz a fa gyökérelemét. Implementáld a következő metódusokat:
 - searchNode(int n): A függvény megkeresi azt a csúcsot, amelynek n az értéke, ezzel tér vissza! (Használd a gyökérből, rekurzívan!)
 - insertNode(Node n): A függvény beszúr a keresőfába egy új csúcsot a megfelelő helyre! (Ügyelj a megfelelő bejárásra)
 - treeWalk(): A függvény bejárja a fát inorder bejárással (Azaz bal gyermek - gyökér - jobb gyermek sorrendben), és kiírja konzolra az értékeket. (Ezt is rekurzívan érdemes megoldani!)
 - deleteNode(int n): Ez a legnehezebb, mert több eset is előfordulhat. Érdemes utánaolvasni, melyikben mi a teendő!