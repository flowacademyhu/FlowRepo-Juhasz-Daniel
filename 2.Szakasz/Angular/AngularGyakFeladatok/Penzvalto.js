Hozz létre egy exchange projektet
Készíts egy service-t és egy exchange komponenst
A serviceben hívd meg ezt a get végpontot: https://api.exchangeratesapi.io/latest
A komponensben kezeld le a végponthívást és a html oldalon egy kártyába jelenítsd meg azt, hogy melyik pénznemhez viszonyítunk, mikori a dátum és hogy az adott pénznemek mennyibe kerülnek a viszonyított pénznemhez képest. (3 tetszőleges pénznemet elég kiírni)
Ezt a végpontot is jelenítsd meg mellette egy kártyában, ugyanilyen 
módszerrel: https://api.exchangeratesapi.io/2010-01-12
+1, egy 3. kártyában jelenítsd meg a kettő közti különbséget (opcionális)
Készíts egy selectet, amibe pénznemeket vegyél fel, az alábbi valuekkal. HUF, USD, EUR, GBP. Ezekből 1 legyen kiválasztható. Mellette legyen egy submit gomb, aminek a megnyomásával lekérjük az alábbi végpontot azzal az értékkel, ami ki lett választva a selectbe. (a végpont legvégének kell lennie változónak (itt USD), ahova beteszed a kiválasztott értéket és azzal kell lefutnia a végpontnak. Pl.: Kiválasztod azt, hogy HUF, akkor a végpont végén lévő USD helyére HUF kerüljön.)
https://api.exchangeratesapi.io/latest?base=USD
Jelenítsd is meg az értékeket egy újabb kártyában