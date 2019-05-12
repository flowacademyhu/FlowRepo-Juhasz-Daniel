1. Készítsünk egy új entitást Variant néven! Ez az entitás a listára felvett termék esetleges helyettesítő termékeit fogja reprezentálni.

  a. Az entitás id-ja Long típusú legyen, és szekvencia generálja az id-t, hogy nekünk ne kelljen pl. mentéskor megadni.

  b. Tároljuk még a helyettesítő termék nevét, illetve egységárát megfelelő típusokkal!

  c. Kétirányú 1:N kapcsolattak kössük össze a termék és a helyettesítő termék entitásainkat! Egy termékhez több helyettesítő termék tartozhasson!

  d. Készítsük el az új entitáshoz a service-t és a repository-t!

  e. Annotáljuk fel a service-einket, hogy tranzakcióként fussanak!

  f. Készítsünk endpointokat is (ehhez kelleni fog ugye controller is), amikkel új helyettesítő terméket tudunk felvenni egy adott termékhez, tudjuk ugyanezt termék id alapján update-elni, illetve törölni is! Legyen olyan végpontunk is, ami egy adott termék id alapján listázza a hozzá tartozó helyettesítő termékeket! Ezen kívül tudjuk csak úgy simán az összes helyettesítő terméket egy endpointon listázni!



2. Egészítsük ki az InitDataLoader-t!

  a. Tesztadatként vegyünk fel néhány helyettesítő terméket bizonyos termékekhez szerverindításkor!



3. Írjunk lekérdezéseket a helyettesítő termék Repository-nkba! 

  a. Írjunk olyan query-t, amely termék id alapján visszaadja a hozzá kapcsolt helyettesítő termékek egységárainak összegét!

  b. (++) Írjunk olyan query-t, amely visszaadja a felvett termékek számát felhasználónként!



4. Gyakorlásképp írjunk teszteseteket a repository, a service és a controller rétegre is, és futtassuk őket!
