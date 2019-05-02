24.
Készíts egy új projektet, music néven
Generáld le az alábbi komponenseket: favourites, rap, pop, all
Készíts egy musicService-t, ami az alábbi végpontokat tartalmazza: getAllMusic, getRetroMusic, getPopMusic, getFavourites
 pop = [{
   id: 0,
   artist: 'Shawn Mendes & Zedd',
   title: 'Lost In Japan'
 }, {
   id: 1,
 artist: 'Bad Bunny',
 title: 'Mia'
}, {
 id: 2,
 artist: 'Halsey',
 title: 'Without Me'
}, {
 id: 3,
 artist: 'Bruno Mars & Cardi B',
 title: 'Finesse'
}, {
 id: 4,
 artist: 'Ne-Yo',
 title: 'Good man'
}]

retro = [{
 id: 5,
 artist: 'Madonna',
 title: 'Into the groove'
}, {
 id: 6,
artist: 'Guns & Roses',
title: 'Paradise city'
}, {
 id: 7,
artist: 'Pixies',
title: 'Where is my mind'
}, {
 id: 8,
artist: 'Bryan Adams',
title: 'Summer of 69'
}, {
 id: 9,
artist: 'Billy Idol',
title: 'Rebel yell'
}]

A fenti object tömböket tedd bele a service-be, ezek lesznek a mockkolt adataink.
A pop és a retro adja vissza az 1-1 tömböt. Az all, adja vissza mindkettőt. A favourites, egyelőre üres tömböt adjon vissza.
Készíts html oldalra 4 ‘fület’ egymás mellé. pop, retro… amik megnyomásával válthatsz a különböző zenék listája között. Írasd ki a html oldalra egymás alá az előadókat és a címeket. Egy oldalon 1 kártyában helyezkedjen el. Ennek a kártyának legyen egy headerje is, ahova kiírod a fül nevét. pl.: Retro. Minden fül váltásnál kérjük le újból az adatokat, hogy az esetleges változások is megjelenjenek.
Minden zene mellé kerüljön egy plusz ikon, aminek zöld a színe. Ha ezt a gombot megnyomjuk, váltson a zöld plusz, egy piros x-re.
Ha fölé visszük ezek fölé az egeret, írjuk ki azt tooltipbe, hogy ‘Add to favourites’ vagy azt, hogy ‘Remove from favourites’, állapottól függően.
A service-be, készíts még egy metódust, updateFavourites néven. Ez a metódus hívódjon meg a plusz és az x gombot nyomására. Amenyibben az adott zeneszám benne van a listában törölje a tömbből, amennyiben nincs, adja hozzá. A metódus ugyanazzal a struktúrával kapja az adatot, mint ahogy a getes metódusok küldik. Csak itt nyilván 1 db objectet küldünk csak fel (vagyis ez a alapján adja hozzá vagy veszi ki a zenét a listáról):     
{ id: 7,
artist: 'Pixies',
title: 'Where is my mind'}

Nyilván ez alapján működjön az ikon megjelenítés is. ID-k vizsgálatának segítségével végezd az elemek hozzáadását/törlését. Ezt a feladatot több módon is megoldhatod. Felvehetsz egy plusz boolean változót az adatszerkezeteknek, de csinálhatsz egy favourites tömböt is, aminek az elemeit hozzáadod/törlöd. Az előbbi ebben a helyzetben elegánsabb. 
A favourites listád mindig legyen naprakész. Amikor átkattintasz a fülre, mindig azok a számok jelenjenek csak meg, amiket hozzáadtál a másik 2 listából. (fusson le a getFavourites metódus)
Legyen egy 5. fül is (komponens), amit ha megnyitsz, egy form jelenik meg. Itt be tudsz írni egy előadót és egy számcímet, valamint ki tudod választani a kategóriát (pop, retro). Amennyiben kitöltötted mind a két adatot, a save gomb megnyomására egy metódus helyezze bele a megfelelő tömbbe a számot. (Kell még egy metódus a service-be, amit meghív a komponensünk, ha a save gombra kattintunk). Az adatkommunikáció itt is azonos legyen, mint ahol a favouritesba egészítjük ki az adatokat.
