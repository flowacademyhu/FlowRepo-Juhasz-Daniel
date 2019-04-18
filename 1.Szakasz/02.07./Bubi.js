let tomb = [10, 5, 6, 4, 9];
const kivalasztas = (tomb) => {
  for (let i = 0; i < 100; i++) {
    for (let j = 0; j < tomb.length; j++) {
      if (tomb[j] > tomb[j + 1]) {
        let temp = tomb[j];
        tomb[j] = tomb[j + 1];
        tomb[j + 1] = temp;
      }
    }
  }
  return tomb;
};
console.log(kivalasztas(tomb));