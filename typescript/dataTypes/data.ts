let myName : string = 'Riya';
console.log(myName,typeof myName);

let age = 22;
console.log(age,typeof age);

let phNo : number;
console.log(phNo,typeof phNo);

let address;
address= 'new vijaynagar colony';

console.log(address,typeof address);

console.log('class creation');

class person{
    constructor(public name: string , public age : number){

    }
}
let person1 = new person('riya',22);
console.log(person1);

class student extends person{
    constructor(name : string, age : number, rollNo : number){
        super(name,age);
    }
}
let student1 = new student('priya',22,14);
console.log(student1);
