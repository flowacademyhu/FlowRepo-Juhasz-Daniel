1.	Írj egy interfészt Rendelheto néven, amely deklarál egy rendel nevű metódust, amely egy egész számot vár paraméterül (hány darabot rendeljünk), visszatérési típusa pedig void!
2.	Írj egy absztrakt Konyv osztályt, melynek két protected adattagja a könyv szerzője és címe, valamint tartalmaz egy absztrakt dedikalASzerzo metódust (melynek nincs paramétere, visszatérési típusa pedig boolean)!
3.	Írd meg a következő három konkrét osztályt:
•	Peldatar, mely a Konyv osztályból származik, de nem implementálja a Rendelheto interfészt. Az örökölteken kívül további adattagja a példatárban található feladatok száma. A példatárat a szerző nem dedikálja.
•	Regeny, mely a Konyv osztályból származik és a Rendelheto interfészt is implementálja. Az örökölteken túl egy tartalmi összefoglaló tárolására alkalmas adattaggal rendelkezik. A regényt a szerző dedikálja.
•	CD, mely implementálja a Rendelheto interfészt, de (értelemszerűen) nem származik a Konyv osztályból. Egy CD tárolja az előadó nevét és az album címét.
Mindhárom osztálynak legyen paraméteres konstruktora az adattagok beállítására, valamint toString metódusa! A Rendelheto interfész rendel metódusát úgy kell megvalósítani, hogy a következő üzenetet írja ki a képernyőre:
Rendelni kell x regenyt az alabbibol: xy, a Regeny osztályban
Rendelni kell x CD-t az alabbibol: xy, a CD osztályban,
ahol x helyére a rendelendő példányszám kerül, xy helyére a megvalósító osztály sztring reprezentációja.
4.	Írj futtatható osztályt (pl. SZTEJegyzetbolt), melyben a következőket kell megvalósítani:
•	Az osztálynak legyen két tárolója, CD-k és könyvek számára.
•	Egy rendelesFelvesz statikus metódus, melynek paramétere egy fájl elérési útvonala, visszatérési típusa pedig void. Feladata, hogy a fájlból beolvasott sorokat feldolgozza, és létrehozzon belőlük Peldatar, CD vagy Konyv példányokat, amiket hozzáad a megfelelő tárolóhoz. 
•	Egy rendel statikus metódus, ami a tárolón lévő összes objektumra meghívja ezek rendel metódusát, ha van nekik. 
Minden esetleges kivételt (főleg FileNotFoundException és IOException) kezelj le vagy kivétel specifikációval, vagy try blokkban!
(A metódus végén ne felejtsd el lezárni a beolvasásra használt stream-et!)
A bemeneti fájl a következőképpen néz ki: (A sorok feldolgozásánál ügyelj arra, hogy az egyes sorokban lévő információk pontosvesszővel vannak elválasztva!)
cd;Rod Stewart;Soulbook
peldatar;Szabo Tamas;Kalkulus II. peldatar;100
regeny;Robert Charles Wilson;Porges;Ez a rovid tartalom...
•	A main-ben hívd meg a rendelesFelvesz metódust.
