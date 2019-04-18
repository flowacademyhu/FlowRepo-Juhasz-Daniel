const mongoose = require('mongoose');
const { table } = require('table');
mongoose.connect('mongodb://localhost:27017/epsilon', { useNewUrlParser: true });

const User = mongoose.model('User', {
  firstname: String,
  lastname: String,
  type: String,
  Alcohol: Array
});

User.find().then(users => {
  const usersForTable = [];
  users.forEach(user => {
    usersForTable.push([
      user.firstname,
      user.lastname,
      user.type,
      user.Alcohol.join(', ')
    ]);
  });
  console.log(table(usersForTable));
  process.exit();
}).catch(err => console.log(err));
