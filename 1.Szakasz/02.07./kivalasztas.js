let tomb = [10, 5, 6, 4, 9];
const kivalasztas = (tomb) => {
  for (let i = 0; i < tomb.length; i++) {
    let kiscica = i;
    for (let j = i + 1; j < tomb.length; j++) {
      if (tomb[j] > tomb[kiscica]) {
        kiscica = j;   
      }
    }
    let temp = tomb[i];
    tomb[i] = tomb[kiscica];
    tomb[kiscica] = temp;
    console.log(kiscica);
  }
  return tomb;
};
console.log(kivalasztas(tomb));