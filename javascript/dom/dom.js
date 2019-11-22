let h1element = document.getElementById('demo')
console.log('Element =',h1element)
console.log('element text =',h1element.textContent)
h1element.textContent = 'good evening'
console.log('----------------------------')


let buttonelement = document.createElement('button')
buttonelement.textContent = 'click'
console.log('button element', buttonelement)
document.body.appendChild(buttonelement);


function showmsg(){
    alert('hello')
}
function changecolor(){
    let pElement = document.getElementById('mover')
    pElement.style.color = 'orange'
}
function removecolor(){
    let.pElement = document.getElementById('mover')
    pElement.style.color = 'orange'
}
function printhello(){
    console.log('hello')
    let usename = document.getElementById('username').value
    document.getElementById('showusername').textContent = username;
}