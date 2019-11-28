console.log('======================================================')
function prime(num)
{
    var a;
    var c=0;
    for(var i=1;i<=num;i++)
    {
        if(num%i==0)
        {
            c++;
        }
    }
        if(c==2)
        {
            a=true;
        }
        else{
            a =false;
        }
        return a;

}
var b =prime(37);
console.log("(function name)the number is prime no? ="+b);



var prime =function(num)
{
    var a;
    var c=0;
    for(var i=1;i<=num;i++)
    {
        if(num%i==0)
        {
            c++;
        }
    }
        if(c==2)
        {
            a=true;
        }
        else{
            a =false;
        }
        return a;

}
var b =prime(36);
console.log("(function expression)the number is prime no? ="+b);
// Prime numbers
//anonymous function
(
    function(num){
        var a;
    var c=0;
    for(var i=1;i<=num;i++)
    {
        if(num%i==0)
        {
            c++;
        }
    }
        if(c==2)
        {
            a=true;
        }
        else{
            a =false;
        }
        console.log("(anonymous function)the number is prime no? ="+a);

    }(20));

    
var prime=(num)=>{
    var a;
    var c=0;
    for(var i=1;i<=num;i++)
    {
        if(num%i==0)
        {
            c++;
        }
    }
        if(c==2)
        {
            a=true;
        }
        else{
            a =false;
        }
        return a;
}
var b =prime(31);
console.log("(lambda function )the number is prime no? ="+b);