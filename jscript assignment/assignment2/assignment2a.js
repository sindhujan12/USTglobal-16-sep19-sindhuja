//factorial of number 
// function name
function facto(a){
    var f =1;
    if(a!=0)
    {
        for(var i=1;i<=a;i++){
            f=f*i;
        }
        return f;
    }
    else{
        f=1;
    }
    return f;
    
}
var b = facto(5);
console.log("(function name) factorial="+b);

//factorial of number
//function expression
var facto = function(a){
    var f =1;
    if(a!=0)
    {
        for(var i=1;i<=a;i++){
            f=f*i;
        }
        return f;
    }
    else{
        f=1;
    }
    return f;
    
}
var b = facto(4);
console.log("(function expression) factorial="+b);
//factorial of number
//anonymous function
(function (a){
    var f =1;
    if(a!=0)
    {
        for(var i=1;i<=a;i++){
            f=f*i;
        }
    }
    else{
        f=1;
    }
    console.log("(anonymous function) factorial="+f);  
}(3));


var facto=(a) =>{
    var f =1;
    if(a!=0)
    {
        for(var i=1;i<=a;i++){
            f=f*i;
        }
        return f;
    }
    else{
        f=1;
    }
    return f;
}
var b =facto(6);
console.log("(lambda function) factorial="+b);
console.log("================================");