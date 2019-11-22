const pichachi ={
name : 'harika',
age  :  100,
color : 'chatha color',
address : {
    city: 'hell',
    pincode : 420
},
}
console.log('javaScript person object',pichachi)
const jsonObject = JSON.stringify(pichachi)
const javaScriptObject = JSON.parse(jsonObject)
console.log('javaScript person object after parse',javaScriptObject)

localStorage.setItem('email','bilgate@gmail.com')
const emailid = localStorage.getItem('email')
console.log('email id',emailid)
localStorage.clear();
