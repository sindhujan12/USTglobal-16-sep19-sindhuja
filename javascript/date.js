var todaydate = new Date();
console.log('todays date', todaydate);

console.log('day',todaydate.getDay());
console.log('year',todaydate.getFullYear());
console.log('month', todaydate.getMonth());
console.log('date', todaydate.getDate());

var constmilli = new Date(0);
console.log('date', constmilli);
var conststring = new Date('nov 10');
console.log('date sting constructor', conststring);
var constyear = new Date(2017,10);
console.log('date year constructor', constyear);

