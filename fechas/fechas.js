/*
var arreglo=[{
    nombre: 'Angelo',
    apellido: 'Aulestia',
    edad: 24
},{
    nombre: 'Kevin',
    apellido: 'Leon',
    edad: 30
},{
    nombre: 'Jenifer',
    apellido: 'Ramirez',
    edad: 16
}];
*/
/*
var buscarUnUsuario=(arreglo,usuarioABuscar)=>{
     var usuarioEncontrado=arreglo.find(usuario=>{
       return usuario.nombre===usuarioABuscar;
     });
     console.log(usuarioEncontrado);
};
buscarUnUsuario(arreglo,'Angelo');
*/
/*
console.log('array completo')
console.log(arreglo)
arreglo.push({
    nombre: 'Stefani',
    apellido: 'Tola',
    edad: 50

});
console.log('array ingresado')
console.log(arreglo);
var buscarUnUsuario=(arreglo,usuarioABuscar)=>{
    var usuarioEncontrado=arreglo.find(usuario=>{
      return usuario.nombre===usuarioABuscar;
    });
    if (usuarioEncontrado===undefined) {
        arreglo.push({
            nombre: 'David',
            apellido: 'Glaciar',
            edad: 60
        
        });
    } else {
        console.log(usuarioEncontrado);
    }
};
buscarUnUsuario(arreglo,'David');
console.log(arreglo)


var usuarioABuscar=(arreglo,usuarioABuscar)=>{
    var usuarioEncontrado=arreglo.filter(usuario=>{
      return usuario.nombre===usuarioABuscar;
    });
    if (usuarioEncontrado===undefined) {
        console.log('usuario no encontrado')
    } else {
        delete usuarioEncontrado;
    }
};
usuarioABuscar(arreglo,'Angelo');
console.log(arreglo)

*/
const moment=require('moment');
moment.locale('es')
var fecha=new Date();
console.log(fecha);
console.log(fecha.getDate());
console.log(fecha.getDay());
console.log(fecha.getMonth());
console.log(fecha.getFullYear());
console.log(fecha.getDay(),'/',fecha.getMonth()+1,'/',fecha.getFullYear());
console.log(moment().format('dddd'));
console.log(moment().format('MM-DD-YYYY'));
const horaActual=moment().format('hh:mm:ss');
console.log(horaActual);
console.log(moment().subtract(3,'hours').toString());

console.log(fecha.toISOString());
console.log(fecha.toDateString());
console.log(fecha.toUTCString());

console.log(moment().toObject()['years']);