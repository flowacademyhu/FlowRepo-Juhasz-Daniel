1. Készítsetek repo-t a mai feladatnak, mely a "RandomArray" nevet viselje!
2. A tulajdonos feladata lesz elkészíteni az array modult, melynek legyen egy függvénye, ami két számot vár paraméterül, ezek lesznek a létrehozandó 2D tömb méretei. A függvény hozzon létre egy akkora 0 értékekkel feltöltött tömböt!
- Legyen egy függvény, amely paraméterül kap egy 2D tömböt "randomInc", és az első véletlenszerűen választott, 0-t tároló pozícióra beírja az '1' számot. Logikai értékkel térjen vissza, mely akkor false, ha már nincs üres (0-s) pozíció!
3. A csapattag készítse el az app.js-t, amely a megjelenítést fogja végezni. 
- Hozzon létre benne 2 darab 5*4 méretű tömböt a tulajdonos függvényének segítségével!
- Legyen egy függvénye "minInc", amely egy paramétere van, amely egy 2D tömb, és a feladata, hogy megkeresi a tömb legkisebb elemét és megnöveli 1-el. 
- Továbbá legyen egy függvénye, "updateLoop" néven, mely meghívja az előző függvényt, törli a konzolt, és kiírja a tömböt. Ezt a függvényt adjuk oda a setInterval-nak, 50 ms idővel. 

4. Ha kész a "randomInc" függvény, akkor azt is hívjuk meg az updateLoop függvényben egy másik tömbbel, és azt is rajzoljuk ki egyszerre. Ha false a visszatérési érték, akkor generáld újra a tömböt!