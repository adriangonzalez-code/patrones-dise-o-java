package com.smoothiemx.java.patrones.decorator2;

import com.smoothiemx.java.patrones.decorator2.decorador.ConChocolateDecorador;
import com.smoothiemx.java.patrones.decorator2.decorador.ConCremaDecorador;
import com.smoothiemx.java.patrones.decorator2.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {

    public static void main(String[] args) {
        Configurable cafe = new Cafe("Café mocha", 7);
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChocolate = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del café mocka es: " + conChocolate.getPrecioBase());
        System.out.println("Los ingredientes: " + conChocolate.getIngredientes());

        Configurable capuchino = new Cafe("Café capuchino", 4);
        conCrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(conCrema);

        System.out.println("El precio del capuchino es: " + conLeche.getPrecioBase());
        System.out.println("Los ingredientes: " + conLeche.getIngredientes());

        Configurable expreso = new Cafe("Café expreso", 3);
        System.out.println("El precio del café expreso es: " + expreso.getPrecioBase());
        System.out.println("Los ingredientes: " + expreso.getIngredientes());
    }
}