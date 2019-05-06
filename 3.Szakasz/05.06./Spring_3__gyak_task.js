1. Mielőtt bárminek nekikezdünk: készítsünk adatbázist a bevásárlólistás alkalmazáshoz!

  a. pgAdmin-ban készítsünk egy új role-t "shoppinglist" néven! A jelszava legyen 123456. Hogy ne legyen probléma a jogokkal, adjunk meg minden jogot a rolenak.

  b. Hozzunk létre egy új adatbázist "shoppinglist" néven! Állítsuk be neki az imént létrehozott role-t. 



2. Konfiguráljuk be az adatbázis elérést az alkalmazásban!

  a. Húzzuk be a szükséges dependencyket (JPA, postgresql connector).

  b. Az application.properties állományt alakítsuk yml típusúra, és adjuk meg az adatbázis konfigurációhoz szükséges elemeket (intendációra figyeljünk)!

    i. Állítsuk be a datasource-t, adjuk meg a DB elérési útját, username-et, jelszót, és adjuk meg a drivert (utóbbi fog az adatbázissal kommunikálni).

    ii. Állítsuk be a JPA tulajdonságait is: sql utasítások legyenek láthatók, adjuk meg a használt SQL dialektust, állítsuk be a ddl-t, hogy update-elje automatikusan a tábláinkat, illetve állítsuk be a "properties.hibernate.jdbc.lob.non_contextual_creation: true" property-t, hogy ne kapjunk szerverindításkor hibát (utóbbi természetesen a yml-es intendációt kövesse).

  c. Indítsuk el a szervert, nézzük meg, minden klappol-e a beállítással.

  

3. Refaktoráljuk a model classt úgy, hogy entitást csinálunk belőle!

  a. Lássuk el a classt a szükséges annotációkkal. Állítsuk be azt is, hogy melyik táblát fogja az entitás leképezni az adatbázisból!

  b. Annotáljuk fel az entitás fieldjeit is, hogy az adatbázis tábla mely oszlopait fogják leképezni. Ahol szükséges, határozzuk meg a mező hosszát is (pl. String típusú fieldek esetén)! Tudassuk a hibernate-tel, hogy melyik property az elsődleges kulcsunk!



4. Refaktoráljuk a Repository-t!

  a. Csináljunk belőle interface-t, ami extendálja a JpaRepository<T, ID> interface-t. A generikusban meg kell adnunk, hogy mely model classhoz fog tartozni a repository, illetve hogy milyen típusú az entitásunk id-ja.

  b. Töröljük a Map-et és a felesleges metódusokat! Készítsünk egy metódus definíciót, amley egy id alapján töröl egy entitás az adatbázisunkból!

  c. Az új repositorynknak megfelelően refaktoráljuk a Service-ünket, illetve ha szükséges a Conrollerünket is!

  d. (++) Vezessünk be validációt a már megvalósított Excpetion classunkkal arra az esetre, ha a megadott ID alapján nem találjuk a DB-ben a keresett entitást!

  e. Teszteljük Postman-ből a munkánkat.



5. (++) Félig-meddig plusz feladat: Készítsük fel az alkalmazásunkat arra, hogy felhasználókat tudjon kezelni. (FONTOS: ugyan plusz feladat, de a szerdai (05.08.) gyakorlóig el kell vele készülni!)

  a. Készítsünk egy "User" nevű entitást, ami a felhasználónkat fogja reprezentálni. Legyen neki username-je (legyen ez az elsődleges kulcs), jelszava, teljes neve!

  b. Csináljuk meg az eddigiek mintájára a Userhez tartozó Repository-t, Service-t, RestController-t! Érdemes úgy használni a nevezéktant, hogy abból kiderüljön, mit csinál az adott class (pl. UserRepository, UserService, ...)

  c. Tudnunk kell a következő műveleteket elvégezni:

    i. Legyen képes az alkalmazás user-t felvenni, módosítani!

    ii. Legyen képes az alkalmazás user-t törölni a username-je alapján!

    iii. Tudjuk kilistázni az összes user-t!

    iv. Legyünk képesek egy adott user-t visszadni a username-je alapján!
