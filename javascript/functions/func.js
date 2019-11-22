console.log('named func');
function add(n1, n2){
console.log('sum=',n1+n2);
}
add(10,20);
 console.log('func expression');
var sub= function(a1,a2){
    console.log('diff=', a1-a2);
    var subvalue = a1-a2;
    return subvalue;
}
var value = sub(20,10)
console.log('value=',value);
//sub(20,10);

console.log('self invoked function');
( function(n1,n2){
    console.log('value=', n1+n2);
}
) (10,5);
greeting('good afternoon');
function greeting(msg){
    console.log('hello',msg)
}
greeting('sindhu');
var greet = function (msg){
    console.log('hi',msg);
}
greeting('indhu');
var greet =  (msg)=>{
    console.log('hi',msg);
}
