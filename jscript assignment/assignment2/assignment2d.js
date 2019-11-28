// Add numbers in array
// function name
function addition(b){
    var temp = 0;
    for(var i=0;i<=b.length;i++)
    {
        if(isNaN(b[i])){
            continue;
        }
        temp =temp + b[i];
    }
    return temp;
}
var ans =[10,20,30,40];
var getSum = addition(ans)
console.log("sum of array(function name)  ="+getSum);
// Add numbers in array
//function expression
var addition = function(b){
  var temp = 0;
  for(var i=0;i<=b.length;i++)
  {
      if(isNaN(b[i])){
          continue;
      }
      temp =temp + b[i];
  }
  return temp;
}
var ans =[10,20,30,40];
var getSum = addition(ans);
console.log("sumof array(function expression) ="+getSum);

// Add numbers in array
//anonymous function
(function(b){
  b =[10,20,30,40];
  var temp = 0;
  for(var i=0;i<=b.length;i++)
  {
      if(isNaN(b[i])){
          continue;
      }
      temp =temp + b[i];
  }
  console.log("sum of array(anonmyous function)=" +temp);
});

// Add numbers in array
//lambda function
var addition = (b)=>{
  var temp = 0;
  for(var i=0;i<=b.length;i++)
  {
      if(isNaN(b[i])){
          continue;
      }
      temp =temp + b[i];
  }
  return temp;
}
var ans =[10,20,30,40];
var getSum = addition(ans);
console.log("sumof array(Fat Arrow) ="+getSum);