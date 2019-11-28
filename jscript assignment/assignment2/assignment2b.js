console.log('======================================================')

var fibo = function (num){
    var a = 0,b=1,count=2,c;
    console.log(a);
    console.log(b);
    while(count<num)
    {
        c=a+b;
        a=b;
        b=c;
        console.log(c);
        count++;
          
    }
    return c;
}
var d= fibo(8);
console.log("(function expression)fibonacci series=");
//Fibonacci Series
//anonymous function
(function (num){
    var a = 0,b=1,count=2,c;
    console.log(a);
    console.log(b);
    while(count<num)
    {
        c=a+b;
        a=b;
        b=c;
        console.log(c);
        count++;
        
    }
    console.log("(Anonmyous Function) fibonacci series");
 }(8));

//Fibonacci Series
//lambda function
var fibo = (num) =>{
    var a = 0,b=1,count=2,c;
    console.log(a);
    console.log(b);
    while(count<num)
    {
        c=a+b;
        a=b;
        b=c;
        console.log(c);
        count++;
          
    }
    return c;

}
var j= fibo(11);
console.log("(Lambda Function)fibonacci series");