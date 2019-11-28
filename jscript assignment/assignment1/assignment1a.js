console.log('object creation without using new keyword');
var person1 = 'sindhu';
console.log('Name =',person1);
var person2 = 'harika';
console.log('Name =',person2);
var car = {
   CarName : 'swift',
   CarColor :'white',
}
console.log('CarName =',car.CarName);
console.log('CarColor =',car.CarColor);

var color = {
   Color1 : 'black',
   Color2 : 'orange',
}
console.log('Color1 =',color.Color1);
console.log('Color2 =',color.Color2);
var pet = {
   pet1 : 'Scooby',
   pet2 : 'Momo',
}
console.log('Pet1 =',pet.pet1);
console.log('Pet2 =',pet.pet2);
console.log('==============================================');
console.log('object creation using new keyword');
var person = new Object();
person.name = 'Sindhu';
person.age  = 22;
console.log(person.name ,'is',person.age, 'years old' );
var person = new Object();
person.name = 'Indhu';
person.age  = 23;
console.log(person.name ,'is',person.age, 'years old' );
var person = new Object();
person.name = 'Bindhu';
person.age  = 24;
console.log(person.name ,'is',person.age, 'years old' );
var car = new Object();
car.name = 'Swift';
car.color  = 'white';
console.log(car.name ,'is',car.color);
var car = new Object();
car.name = 'Benz';
car.color  = 'Black';
console.log(car.name ,'is',car.color);


console.log('==========================================');
console.log('array creation without using new keyword');
var arr1 =['sindhu','harika','simran'];
var arr2 =[23,22,24,25];
var arr3 =['male','female']
var arr4 =['black','white','yellow'];
var arr5 =['momo','tommy','scooby'];
console.log('Name     =',arr1[0]);
console.log('Age      =',arr2[1]);
console.log('Gender   =',arr3[1]);
console.log('FavColor =',arr4[0]);
console.log('PetName  =',arr5[2]);

console.log('==========================================');
console.log('array creation with using new keyword');
var person =new Array(1,2,3,4);
var age = new Array(23,22,24,25);
var gender =new Array('male','female');
var favColr =new Array('black','white','yellow');
var petName =new Array('momo','tommy','scooby');
console.log('ID       =',person[0]);
console.log('Age      =',age[1]);
console.log('Gender   =',gender[1]);
console.log('FavColor =',favColr[1]);
console.log('PetName  =',petName[0]);
console.log('===========================================')

var colors=['Blue','Black','Green','Yellow','Red']
    for(var i=0;i<colors.length;i++)
    {
        console.log(colors[i]);
    }

