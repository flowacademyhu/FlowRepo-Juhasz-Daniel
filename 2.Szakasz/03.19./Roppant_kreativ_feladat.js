1) Írj Penz osztályt, ami pénzt valósít meg, és helyezd el a penz csomagba. 
a) Egy pénzről el kell tárolni a névértékét (lehet 10, 100 és 1000 Ft), típusát (papírpénz, vagy aprópénz).
c) Írj az osztálynak konstruktort, ami a pénz típusát, valamint névértékét kapja meg, és ezek alapján állítja be a mezők értékét.
d) Az osztály legyen String formára alakítható a következő módon: "X Ft - apró/papírpénz"

2) Írj egy Penztarca osztályt is a penz csomagba pénztárcák megvalósítására. 
a) Egy pénztárca megadja, hogy mennyi pénzt tartalmaz, valamint tárolja a benne lévő pénzeket egy külön tömbben.
b) A konstruktora hozzon létre egy pénztárcát, amiben 0 db pénz van, valamint rendelkezik egy tömbbel a benne lévő pénzeknek.
c) Hozz létre olyan penzBetesz metódust, ami hozzáad egy pénzt a tömbhöz, és módosítja a pénztárcában lévő pénzek számát ennek megfelelően.
d) Hozz létre olyan penzSzamol metódust, ami visszaadja, hogy egy adott címletű pénzből mennyi van a pénztárcában.
e) Overloading segítségével oldd meg, hogy a penzSzamol metódus az adott típusú pénzek darabaszámát is vissza tudja adni.

3) Írj egy, a penz csomagon kívül futtatható osztályt, ebben:
a) Hozz létre egy Penztarca objektumot.
b) Hozz létre legalább egy Penz objektumot, és add hozzá a Penztarcahoz.
c) Írass ki minden Penz objektumot.
c) Használd mindkét penzSzamol metódust.