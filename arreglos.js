var arreglo=[1, 2, 3, 4, 5];
/*
var palabraString='kevin';
//para dividir una cadena por medio de un espacio
var arregloPalabra=palabraString.split('');
console.log(arregloPalabra.reverse());
//agrega el arreglo al final del areglo
arreglo.push(6);
console.log(arreglo.length);
//quita un arreglo al final
arreglo.pop();
for (let index = 0; index < arreglo.length; index++) {
    const element = arreglo[index];
    console.log(element);
}
//accede a un arreglo especifico del areglo
console.log(arreglo[3]);
//divide el arreglo en especifico
console.log(arreglo.slice(2,4));
//da la vuelta al arreglo
console.log(arreglo.reverse());
//agrega un elemento al primer poscicion
console.log(arreglo.shift(66));
//quita el primer dato en la ultima poscicion del arreglo
console.log(arreglo.unshift(3));
console.log(arreglo);
var arregloDividido=arreglo.slice(2,4);
console.log(arregloDividido);
//elimina datos del arreglo dandole la poscicion y cuantos quiere eliminar
arreglo.splice(0,1);
console.log(arreglo);
*/
/*
//muestra el arreglo y en que poscicion esta cada dato del arreglo (es igual que el for)
//el primer valor sera el elemento y el indice
arreglo.forEach((elemento,indice)=>{
    console.log(indice);
    console.log(elemento);
});
//para la calculacion de cada arreglo 
var arregloMutado=arreglo.map((elemento,indice)=>{
      return elemento*10;
//se puede combinar con todo lo que vimos arriba para mejor utilidad
}).forEach((e,i)=>{
    console.log(e);
}).map((e)=>{
    return e;
});
*/
/*
//verificar si hay un arreglo igual y devuelve una expresion booleana
var metodoSome=arreglo.some((e, i)=>{
    return e==2;
});

var arreglox2=arreglo.map((elemento,i)=>{
    return elemento*2;
}).every((e)=>{
    return e%2===0;
})
console.log(arreglox2);
*/
/*
//retorna un valor en especifico
var metodoFilter=arreglo.filter((elemento,i)=>{
    return elemento === 2;
});
console.log(metodoFilter);
*/
var json={datos:[{nombre :''},{edad:''}]};
{
    datos[
        {
           nombre: "angelo", edad:17

        },
        {
            nombre: "kevin", edad:25
        },
        {
            nombre: 'garcia', edad:27
        },
        {
            nombre: 'alexandra', edad:50
        },
        {
            nombre: 'vega', edad:17
        }
        

    ]
}
let a=0;
json.forEach(element => {
    a+=element.edad;
});