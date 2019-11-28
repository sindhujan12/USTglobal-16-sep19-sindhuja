console.log('=======================================')
var date = new Date();
var num = date.getDay();
var num1 = date.getMonth();
var arryDay = ['Sun','Mon','Tus','Wen','Thu','Fri','Sat'];
var arryMonth = ['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec'];
console.log('DAY : MONTH : YEAR');
console.log(arryDay[num],':',arryMonth[num1],':',date.getFullYear());
console.log('---------------------------------------')
console.log(Math.random()*100);
