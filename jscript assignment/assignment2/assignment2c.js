function radius(x){
    var CircumferenceOfCircle= Math.PI*x*x;
    console.log('Circumference Of Circle =',CircumferenceOfCircle);
}
radius(12);
console.log('============================================================');
var radius1 = function(x1){
    var CircumferenceOfCircle= Math.PI*x1*x1;
    console.log('Circumference Of Circle =',CircumferenceOfCircle);
}
radius1(14);
console.log('============================================================');

(function (r2){
var CircumferenceOfCircle =Math.PI*r2*r2;
console.log("circumference of circle =",CircumferenceOfCircle);
}(14));
console.log('============================================================')

var radius2 =(x2) =>{
var CircumferenceOfCircle= Math.PI*x2*x2;
    console.log('Circumference Of Circle =',CircumferenceOfCircle);
}
radius2(16);