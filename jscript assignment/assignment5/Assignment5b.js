
function viewPrss()
{
  let elementPass = document.getElementById('pass');
  if(elementPass.type === 'password')
  {
    elementPass.type = 'text';
  }
  else{
    elementPass.type = 'password';
  }
}
function buttonOnClick()
{
 let elementUn = document.getElementById('name').value;
 let elementPass = document.getElementById('pass').value;
 let eleUnTrim = elementUn.trim();
 let elePassTrim = elementPass.trim();
 if(eleUnTrim.length < 5 || elePassTrim < 8) 
 {
   alert("check ur username & password..");
 }
 else{
   alert("sumbit done..");
 }
}