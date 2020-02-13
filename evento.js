const EventEmitter =require('events');

class eventoUno extends EventEmitter{}

var instanciaEventoUno=new eventoUno();

//on; es aquel que esta escuchando el evento
instanciaEventoUno.on('saludar', respuesta=>{
    console.log('hola', respuesta);
    console.log(`hola que pedo tu vida men ${respuesta}`);
});
//emit; es aquel que emite el evento
instanciaEventoUno.emit('saludar','Angelo');
// evento principal