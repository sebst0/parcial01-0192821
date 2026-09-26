# EJERCICIO 1

- Qué añadí?

Añadí las variables rachaActual y rachaMaxima para calcular la secuencia de sectores consecutivos cuyo consumo superó el promedio

Añadí la lógica de conteo y comparación dentro del ciclo para ir actualizando la racha más larga

Añadí las impresiones en consola para mostrar la cantidad de sectores que superaron el promedio y la racha más larga obtenida

- Qué corregí?

La validacion de numeros negativos: cambie el if por un while en la validación de números negativos, porque ante si el usuario volvia a escribir por segunda vez un numero negativo, lo iba a tomar entonces con el while le pide el numero hasta que por fin sea positivo

Cálculo de promedio: Corregí el promedio haciendo un casting a double para que no truncara los decimales y fuera exacto

La enumeracion de los sectores: lo ajuste para que sectores empezaran desde el 1 y no desde el 0

Cierre del scanner : le añadi el leer.close() para cerrar

# EJERCICIO 2

- Que añadi?

añadi el arreglo de sumaDias de tamaño 5 para acumular la producción total de cada uno de los días

añadi la variable sumaTotal que acumula todo generado en la fabrica

añadi las variables mayor, posicionmayor, menor y posicionmenor para calcular los máximos y mínimos que pedia

añadi los bucles y tambien para imprimir los totales por máquina, por día, la máquina con mayor producción, el día con menor producción y la matriz completa en formato cuadrado

- Que corregi?

La validacion de numeros negativos: cambie el if por un while en la validación de números negativos, porque ante si el usuario volvia a escribir por segunda vez un numero negativo, lo iba a tomar entonces con el while le pide el numero hasta que por fin sea positivo

Lo que produjo cada maquina tras los 5 dias: corregi el vector suma ya que estaba tomando la fila 0 por lo q iba a sumar siempre esa fila y lo cambie por i para q fuera acorde a la maquina 

La enumeracion de los numeros y dias: lo ajuste para que las maquinas y los dias empezaran desde el 1 y no desde el 0

La impresion de la matriz: la corregi para que la mostrara de manera cuadrada y no por columnas

Cierre del scanner : le añadi el leer.close() para cerrar

Algunos errores de ortografia que no se entendian

NOTA: iba bien solo q no me alcanzo el tiempo D: