var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var myName = 'Riya';
console.log(myName, typeof myName);
var age = 22;
console.log(age, typeof age);
var phNo;
console.log(phNo, typeof phNo);
var address;
address = 'new vijaynagar colony';
console.log(address, typeof address);
console.log('class creation');
var person = /** @class */ (function () {
    function person(name, age) {
        this.name = name;
        this.age = age;
    }
    return person;
}());
var person1 = new person('riya', 22);
console.log(person1);
var student = /** @class */ (function (_super) {
    __extends(student, _super);
    function student(name, age, rollNo) {
        return _super.call(this, name, age) || this;
    }
    return student;
}(person));
var student1 = new student('priya', 22, 14);
console.log(student1);
