1. Refaktoráljuk a tegnap implementált bevásárlólista alkalmazást.


  a. Készítsünk egy Repository classt.

    i. Ebbe a classba helyezzük át azt a Map-et vagy List-et (ki hogy valósította meg), amely a bevásárlólista elemeit tárolja.

    ii. Készítsünk metódusokat, amelyek az adatelérést fogják megvalósítani. Szükség lesz egy olyanra, amely a mentést fogja végezni (create-et és update-et egyaránt), illetve egy olyanra, amely a törlést fogja végezni a bevásárlólistáról. A mentés térjen vissza a mentett termékkel, a törlés pedig a törölt termék id-jával. Ezen felül kell még nekünk egy olyan metódus, amely a listán lévő összes terméket adja vissza, illetve egy, amely egy id alapján egy bizonyos terméket ad vissza.


  b. Készítsünk egy Service classt.

    i. Autowired használatával injektáljuk be az imént elkészített Repository-t.
    
    ii. Itt valósítsunk meg olyan metódusokat, amelyek a Repository előbb megvalósított függvényeit fogják meghívni (save, delete, findAll, findOne). A metódusok térjenek vissza úgy, mint ahogy azt a Repositoryban láthattuk.


  c. Refaktoráljuk a Controller classunkat. Injektáljuk be a Service classt, amit az imént létrehoztunk. Az endpointjaink maradhatnak úgy, ahogy voltak, a Serviceünk megfelelő metódusait kell bennük meghívnunk.


  d. (++) Ha tegnap a plusszal jelzett feladatokat nem valósítottuk meg, és maradt időnk, implementáljuk őket, a nemrég létrehozott Service és Repository felhasználásával. Ha a megvalósítás tegnap megvolt, akkor refaktoráljuk őket az előzőeknek megfelelően.


  e. Teszteljük ki a munkánkat Postman-ben. Ügyeljünk a tesztelés, és megvalósítás során is az alaposságra.

  

2. Vezessünk be validációt a bevásárlólista alkalmazásban.


  a. Készítsünk egy classt, ListItemNotFoundException néven. Ez a class extendálja a RuntimeException classt. Készítsünk neki egy konstruktort, amely beállít egy Stringet a superclassban, amely a hibaüzenetünket fogja tartalmazni.

    i. ListItemNotFoundException esetén a hiba szövege legyen: "Az elem nem található a listában".

    ii. (++) Csináljuk meg úgy a konstruktort, hogy a hibás elem id-ját is hozzácsapja a hibaüzenethez!

  b. Készítsünk egy ControllerAdvice classt, megfelelően annotáljuk fel. Készítsünk bele egy handler metódust, amely az előbb implementált Exception-ünket fogja kezelni. A visszatérési HTML státusz NOT FOUND legyen.

    I. (++) Aki szeretné, lehet a visszatérési HTTP státusz: I AM A TEAPOT :)


  c. Teszteljük ki a munkánkat Postman-ben. Ügyeljünk a tesztelés, és megvalósítás során is az alaposságra.

