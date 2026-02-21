Explicacion de mi algoritmo

Para esta actividad he creado un cifrado sencillo que se apoya en el cifrado cesar que nos daba el enunciado. 
Mi algoritmo tiene dos pasos muy basicos: primero se cifra el texto usando el metodo del cesar con una clave normal, y despues le doy la vuelta a toda la cadena de texto de principio a fin usando la funcion reverse de java. Asi el texto cambia bastante y no es tan facil de leer del tiron.

Para descifrarlo hago lo mismo pero al reves, primero cojo el texto cifrado y le doy la vuelta para que se quede en el cesar normal, y despues llamo al metodo descifrar del cesar para obtener la frase original que habiamos puesto al principio.
