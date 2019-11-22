const msg = new Promise(function(resolve,reject){
    if(30>10){
resolve('success')
    }else{
        reject('failed')
    }
}
)

msg.then(function(mesg){
    console.log('succcess message',mesg)
}).catch(function(error){
    console.log('failure message',error)
})
console.log('-----------------------------------------------------------')

const emp = new Promise(function(resolve,reject){
    if(30>20){
resolve([{
    name : 'sanju',
    age : 21
},{
    name : 'cherry',
    age : 22

}])
    }else{
        reject('failed')
    }
}
)

emp.then(function(data){
    console.log('emp data',data)
}).catch(function(error){
    console.log('failure message',error)
})
// clousures

function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter + 10
        return count
    }
    return innerFunction
}
let innerFunc = outerFunction(20)
let counter = innerFunc()
console.log('counter value',counter)


























