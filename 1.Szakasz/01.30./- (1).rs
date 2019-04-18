let enObjektumom = { kulcs: 'ertek', szamErtek: 23 };

console.log(enObjektumom);
console.log(enObjektumom.kulcs);
console.log(enObjektumom['kulcs']);

let car = {
  manufacturer: 'Toyota',
  model: 'Corolla',
  year: 1998,
  pista: {
    kulcs: 1,
    kulcs2: 2
  },
  tomb: [
    1,
    2,
    3,
    {
      uristen: true,
      flow: 'kiraly'
    }
  ]
};

let carManufacturer;
let carModel;
let carYear;

console.log(car);

let neo = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
];
let x = 0;
let y = 2;
console.log(neo[y][x]);
