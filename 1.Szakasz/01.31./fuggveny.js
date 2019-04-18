
const osszeadas = (a, b) => {
  let eredmeny = a + b;
  return eredmeny;
};

function kivonas (a, b) {
  let eredmeny = a - b;
  console.log('ennek a kivonasnak az eredmenye', eredmeny, 'lesz');
  return eredmeny;
}

const szorzas = (a, b) => a * b;

const osztas = (a, b) => a / b;

let pelda1 = osszeadas(1, 5);
console.log(pelda1);

let pelda2 = osszeadas(4, 6);
console.log(pelda2);

let pelda3 = kivonas(10, 5);
console.log(pelda3);

let pelda4 = szorzas(10, 5);
console.log(pelda4);

let pelda5 = szorzas(10, 5);
console.log(pelda5);

const hello = (name = 'Béla') => {
  console.log(`Hello ${name}! :)`);
};

hello('Szandra');
hello('Tamás');

const kisebb = (ez, ennel) => {
  if (ez < ennel) {
    return true;
  }
  console.log('kisebb');
  return false;
};

console.log(kisebb(1, 3));
