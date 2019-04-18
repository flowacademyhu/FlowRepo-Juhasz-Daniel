
let number = 0;

const inc = () => {
	console.clear(); //Letörli a konzolt
	console.log(number);
	number++;
}

setInterval(inc, 50); // Meghívja az inc függvényt 50 ms időközönként!