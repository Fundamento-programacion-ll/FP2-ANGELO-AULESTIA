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
/*
var buscarUnUsuario=(arreglo,usuarioABuscar)=>{
     var usuarioEncontrado=arreglo.find(usuario=>{
       return usuario.nombre===usuarioABuscar;
     });
     console.log(usuarioEncontrado);
};
buscarUnUsuario(arreglo,'Angelo');
*/
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
    var usuarioEncontrado=arreglo.find(usuario=>{
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

