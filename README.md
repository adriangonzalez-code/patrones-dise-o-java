# PATRONES DE DISEÑO

Nos permiten escribir código limpio, solventan el problema de repetición de código.

Existen 3 categorias de patrones de diseño:

1. Creacionales
2. Estructurales
3. Comportamiento

## PATRONES CREACIONALES

### Patrón Singleton

Nos permite crear una sola instancia de una clase, es decir nos permite crear una sola referencia de ese objeto que será compartida para toda la aplicación.

Para aplicar ese patrón en una clase, debemos sobreescribir el constructor y definirlo como privado.

### Abstract Factory

Sirve para crear familia de objetos que están relacionados mediante la herencia o implementación de interfaces. Una característica de este patrón es que nuestra aplicación sea escalable, que nos permita añadir nuevas implementaciones concretas sin afectar las anteriores.

## PATRONES ESTRUCTURALES

### Patrón Decorator

Tiene como finalidad agregar funcionalidad dinámica al objeto, pero sin utilizar herencia.

### Composite

Nos permite construir objetos complejos a partir de objetos simples, pero que tengan en común una clase abstracta.

## COMPORTAMIENTO

### Observer

Es un patrón de diseño que define una dependencia entre objetos de uno a muchos. Cuando el objeto principal que se está observando cambia su estado, notifica ese cambio a todos sus objetos dependientes. Es un patrón de tipo comportamiento porque define el cómo se comunican entre esas clases, pero también es de tipo estructural por las relaciones entre clases