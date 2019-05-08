1. Valósítsunk meg egy az egyhez kapcsolatot a User és a ShoppingListItem entitásaink között! 

  a. Elegendő egyoldalú kapcsolatot létrehozni a ShoppingListItem entitásban.

  B. Generáljunk paraméterezett és default konstruktort mindkét entitásunkhoz!

  b. Töröljük a DB jelenlegi tábláit!

  c. Indítsuk el a szervert, hogy a modellünk alapján legenerálódjanak a táblák!



2. Készítsünk egy InitDataLoader-t!

  a. Az InitDataLoader először töltse fel a User entitásunk tábláját néhány tesztadattal!

  b. Ezek után töltsük fel a bevásárlólista elemeket tároló táblánkat tesztadatokkal. Itt konstruáláskor adjuk meg a User-t is, hogy kihez tartozik az adott bevásárlólista elem. Mivel 1:1 kapcsolatot valósítottunk meg, ügyeljünk arra, hogy egy listaelem pontosan egy felhasználóhoz tartozzon!



3. Írjunk lekérdezéseket a Repository-nkba! 

  a. Írjunk egy olyan HQL-es query-t, amely megszámolja, hogy felhasználónként hány bevásárlólista elemet találunk! A Repository-s metódus egy Longokat tartalmazó listával térjen vissza. Hogy tudjunk tesztelni Postmanből, készítsünk egy Service metódust és egy REST endpointot is, ami ezt a lekérdezést meghívja!

  b. Írjunk egy olyan method-based query-t, amely egy megadott login név alapján visszaadja, hogy a megadott userhez milyen bevásárlólista elemek tartoznak! Téjünk vissza egy bevásárló-istaelemeket tartalmazó List-tel. Hogy tudjunk tesztelni Postmanből, készítsünk egy Service metódust és egy REST endpointot is, ami ezt a lekérdezést meghívja!

  c. Írjunk egy olyan method-based query-t, amely azokat a listaelemeinket adja vissza, ami egy paraméterként megadott betűvel kezdődik, és az eredményt rendezzük betűrendbe! Téjünk vissza egy bevásárló-istaelemeket tartalmazó List-tel. Hogy tudjunk tesztelni Postmanből, készítsünk egy Service metódust és egy REST endpointot is, ami ezt a lekérdezést meghívja!

  d. Teszteljük Postman-ből a lekérdezéseinket.
