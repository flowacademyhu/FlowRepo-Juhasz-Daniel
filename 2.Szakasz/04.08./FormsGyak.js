Forms
Készíts egy formot a Fruits komponensbe name (input, string), color (input string), kalories (input number), size (select, string) mezőkkel
Legyen hozzá interface, a 10-es pontban leírt szerkezet alapján
Legyen egy id-ja is a komponensnek, ami 1-ről indul és a későbbiekben minden gyümölcs hozzáadásával 1-gyel növekszik
A name kitöltése legyen kötelező, ezt jelöld egy piros csillaggal. Alá small tagbe piros színnel írd ki, “A kitöltés kötelező. Min 4, Max 15 karakter. Ez csak akkor jelenjen meg, ha már bekattintott a mezőbe és úgy kattintott ki a user, hogy nem teljesültek a fent leírt feltételek
Amennyiben a kalória mező értéke meghaladja a 100-at, írd ki alá sárgával, hogy ‘Too much calories’
A size mezőt kötelező legyen kitölteni, piros csillaggal jelöld. Amíg nem választanak ki semmit, írd ki placeholderbe hogy ‘Please choose a size’. A többi választható érték a ‘small’, ‘medium’, ‘big’ legyen.
Legyen egy save gomb is, ami addig ne legyen megnyomható, amíg a name vagy a size nincs kitöltve.
Kösd be az adatokat two-way bindinggal
Ha a save gombra kattintunk, jelenítsük meg a gyümölcs minden adatát html oldalon. Kicsit szépíthetünk is rajta.
 (+1) Imitáljunk backend működést. Azt várja el tőlünk a backend, hogy mentésre az alábbi adatszerkezettel küldjünk fel neki adatot, pl.:
{id: ‘3’
name: ‘apple’,
color: ‘green’,
kalories: 40
size: ‘medium’}
        Az adatokat ilyen object-be kellene rendezni, majd a save gomb megnyomására jelenítsd meg az objectet a console-on. (Ez éles backend mellett egy put, vagy egy post kérés lesz)
