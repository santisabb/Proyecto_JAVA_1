Primer proyecto en JAVA, nivel avanzado.

Se va a basar en crear una pequeña API REST, que recibira una peticion con ciertos parametros y dependiendo de estos se 
emitira una respuesta. 

Un poco de conceptos; JAVA originalmente es un lenguaje OOP, pero hereda
ciertas cosas de la programacion funcional, por eso se puede decir que JAVA
es un lenguaje pseudofuncional.

La programacion funcional es un paradigma declarativo Nos enfocaremos en 
"qué" estamos haciendo y no en "cómo" se está haciendo que sería el enfoque 
imperativo. Esto quiere decir que nosotros expresaremos nuestra lógica sin describir controles de flujo;
no usaremos ciclos o condicionales.

FUNCIONES PURAS: Siempre devuelven el mismo resultado y no deben 
producir efectos secundarios.

FUNCIONES DE ALTO ORDEN: Una funcion puede llamar a otra funcion
y debe devolver otra funcion, mas sencillamente, una funcion recibe como 
parametro una funcion o devuelve otra funcion.
 
RECURSIVIDAD: Esto se define como el proceso de definir algo en terminos de 
si mismo. El componente clave de un método recursivo es una declaración 
que ejecuta una llamada a sí mismo.

DESBORDAMIENTO DE PILA (stack overflow): Demasiadas llamadas recursivas
a un metodo pueden causar el desbordamiento de la pila o stack
overflow.

El almacenamiento de los parametros y variables esta en la pila y cada nueva
llamada y cada llamada crea una nueva copia de las mismas, es posible que la 
pila se agote.

TIPOS DE RECURSIVIDAD

**Recursividad de cola:** Lo ultimo que se ejecuta es la llamada de la funcion a 
si misma.