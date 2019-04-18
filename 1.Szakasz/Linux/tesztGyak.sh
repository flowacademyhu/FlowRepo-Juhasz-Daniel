#!/bin/bash

VAR="kutya"

echo $VAR 

read number

if [ $number -eq 1 ] ; then

	echo "kiskutya"

else

	echo "kiscica"

fi

STRING="kutya"

#while [ $NUMBER -le 3 ] ; do

#	echo majom $NUMBER
#	NUMBER=NUMBER + 1
#done

for i in *
do
echo $i
done

while [ $STRING != "macska" ] ; do

	echo Ha ki akarsz lépni írd be, hogy macska'!'
	read STRING
	echo A beírt szó a $STRING volt.

done
