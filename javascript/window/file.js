console.log('window object',window);
console.log('this keyword',this);
console.log(this===window);


//window.alert('welcome SINDHUJA');
//alert('welcome');

//let confirmExit = confirm('are you you want to exit');
//console.log('confirm exit',confirmExit)
//let username = prompt('what is your name','sindhu')
//console.log('user name',username)


const per ={
    fName : 'alia',
    age : 26,
    lName: 'bhat',
    getName : function(){
        return this.fName + ' ' + this.lName
    }
}
let fullName = per.getName()
console.log('full name', fullName)