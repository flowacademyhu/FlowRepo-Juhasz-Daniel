#!/bin/bash

if ! [ -f adatok.dat ]
then
	echo "Nem létezik a fájl!"
	exit 1
fi

echo "Add meg a sorszámot!"
read SORSZAM
rekordok=`wc -l adatok.dat | cut -f 1 -d " "`
if [ $SORSZAM -ge $rekordok ]
then
	echo "Túl nagy sorszám"
	exit 1
fi

felhasznalo=`egrep "^$SORSZAM;.*" adatok.dat`
nev=`echo $felhasznalo | cut -d ";" -f 2`
szulhely=`echo $felhasznalo | cut -d ";" -f 3`
szulido=`echo $felhasznalo | cut -d ";" -f 4`
anyjaneve=`echo $felhasznalo | cut -d ";" -f 5`
leanykori=`echo $felhasznalo | cut -d ";" -f 6`
lakhely=`echo $felhasznalo | cut -d ";" -f 7`
nem=`echo $felhasznalo | cut -d ";" -f 8`
csaladiAllapot=`echo $felhasznalo | cut -d ";" -f 9`
gyermekekSzama=`echo $felhasznalo | cut -d ";" -f 10`

mostaniEv=`date +%Y`
szulEv=`echo $szulido | cut -f 1 -d " "`
echo "Ennyi idős: " $((mostaniEv - szulEv))