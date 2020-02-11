var nombre='Angelo Aulestia';
var b='';
var tn=nombre.length;
console.log(nombre.length);
console.log(nombre.substr(2));

while(tn>=0){
  
    b+= nombre.charAt(tn)
    console.log(b);
    tn--
}

console.log(nombre.slice(1,-8));
console.log(nombre.split(" "));

var texto="hola que hace"
console.log('Antes de remplazar');
console.log(texto);
console.log('Despues de reemplazar');
console.log(texto.replace('que','khe'));

var ejemtri="hola";
console.log(ejemtri);
console.log(ejemtri.trim());

console.log(ejemtri.concat(" ",nombre));
console.log(ejemtri.toUpperCase());

var noticia = 'Realiza fotografías de 20 megapíxeles y puede utilizar un perfil de color Dlog-M de 10 bits, con el que se obtiene un rango dinámico más amplio al registrar hasta mil millones de colores. Esto queda bastante por encima de los 16 millones de colores de los perfiles de 8 bits, pudiendo dejar más margen y libertad en la edición posterior del material. Por su parte, el Mavic 2 Zoom cuenta con un sensor CMOS de 1/2,3 pulgadas y zoom óptico, lo cual da nombre al propio producto. En este caso es capaz de realizar capturas de 12 megapíxeles, disponiendo un zoom automático híbrido (que combina detección de fase y contraste) de una función de "Superresolución" que recurre al zoom óptico para realizar nueve fotografías y componer una sola con todas ellas de 48 megapíxeles (con más detalle).'
console.log(noticia.length);
var noti1=noticia.replace(/ /g,"*-*");
console.log(noti1.charAt(",",".",";"));
console.log(ejemtri.toUpperCase(0,312,790));
console.log(noti1)
