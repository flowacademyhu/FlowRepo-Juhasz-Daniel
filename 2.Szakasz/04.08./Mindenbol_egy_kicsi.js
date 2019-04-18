Készíts egy új projektet practice néven
Készíts egy komponenst, first néven
Ebben a komponensben legyen két number input meződ html oldalon, aminek a bevitt értékét ts oldalon egy metódussal összeadod és gombnyomásra kiíratod html oldalon
Amennyiben az érték nagyobb, mint 100, legyen az érték háttérszíne piros. Ha 100-nál kisebb legyen zöld.
Készíts ezek alá egy text inputot is, ami mellett legyen egy checkbox és csak akkor írhassunk az inputba, ha a checkbox be van pipálva. Ha beírunk egy értéket a mellette lévő add gomb megnyomására kerüljön bele egy tömbbe. A tömb értékét egymás alá megjelenítve folyamatosan mutassuk HTML oldalon. Az add legyen letiltva, ha a mezőbe 3-nál rövidebb és 13 karakternél hosszabb szöveget akarunk bevinni.
Amennyiben a tömb eléri az 5 elemet, írjuk ki, hogy nem vehető fel több érték és tiltsuk le a mellette lévő gombot.
Minden második elem szöveg színe legyen lila
Készíts egy second komponenst, amit hívj meg a first komponens HTML oldalán
Inputtal add át neki a felvett tömb értékét, majd a legutolsó elemét írasd ki a komponens html oldalán.
Készíts egy input mezőt ebben a komponensben is és az itt beírt értéket passzold fel a first komponensnek, majd helyezd bele a tömbbe, amibe a többi értéket tetted. Ebből a komponensből bármennyi elem legyen belehelyezhető a tömbbe.
A két komponens egész html részét tedd eltüntethetővé 1-1 gombbal (collapse) (nyilván a gomb kivételével), majd tüntesd is el őket. A gomb újboli megnyomásával legyenenek újra láthatóak az adatok
Hozz létre pokemonService néven egy servicet, valamint egy pokemon komponenst
A pokemon komponenst egy Pokemons feliratú gomb megnyomásával tedd elérhetővé. Ha a Pokemons komponens oldalára ugrassz, legyen egy back gomb is, ami a kódból visszanavigál a fő oldalra.
A pokemon komponensbe injektáld be a servicet.
A servicenek készíts egy get metódust, ami lekéri az alábbi végpont értékét
    https://pokeapi.co/api/v2/pokemon/
A komponensben mentsd el a visszakapott végpont értékét egy tömbbe, aminek IPokemon a típusa, ami egy interface. Hozd is létre ezt az interface-t, a bejövő adatok alapján.
Jelenítsd meg html oldalon a count változóját és a results tömb utolsó 10 elemét
Ha valamelyik elem fölé visszük az egeret, annak a háttérszíne legyen zöld. Ha elvisszük onnan az egeret változzon vissza alapértelmezettre.
Készíts egy formot, aminek a segítségével új pokemont tudsz beszúrni a tömbbe, a form alján lévő ‘Add pokemon’ gomb megnyomásával. Ez a gomb legyen kék színű.
+++ Hozz létre egy dogService-t. 1 get metódusa legyen, getDogs néven. Ezt a végpontot hívja: https://dog.ceo/api/breeds/image/random
+++Hozz létre egy dog komponenst is, ahol lekezeled ezt a metódust. Egy ‘Show a dog’ gombot hozz létre html oldalon, aminek a segítségével a végponton visszatérő képet megjeleníted a böngészőben.
