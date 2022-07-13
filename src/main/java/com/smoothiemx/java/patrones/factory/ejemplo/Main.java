package com.smoothiemx.java.patrones.factory.ejemplo;

import com.smoothiemx.java.patrones.factory.PizzaProducto;
import com.smoothiemx.java.patrones.factory.PizzeriaCalifornaFactory;
import com.smoothiemx.java.patrones.factory.PizzeriaNewYorkFactory;
import com.smoothiemx.java.patrones.factory.PizzeriaZonaAbstractFactory;

public class Main {

    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCalifornaFactory();

        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza: " + pizza.getNombre());

        pizza = ny.ordenarPizza("peperoni");
        System.out.println("Andres ordena una pizza: " + pizza.getNombre());

        pizza = california.ordenarPizza("vegetariana");
        System.out.println("James ordena pizza: " + pizza.getNombre());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Linus ordena la pizza: " + pizza.getNombre());

        pizza = california.ordenarPizza("peperoni");
        System.out.println("John ordena la pizza: " + pizza.getNombre());

        System.out.println("pizza = " + pizza);
    }
}
