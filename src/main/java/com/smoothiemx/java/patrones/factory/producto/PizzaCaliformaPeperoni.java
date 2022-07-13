package com.smoothiemx.java.patrones.factory.producto;

import com.smoothiemx.java.patrones.factory.PizzaProducto;

public class PizzaCaliformaPeperoni extends PizzaProducto {

    public PizzaCaliformaPeperoni() {
        super();
        nombre = "Pizza Califorma Peperoni";
        masa = "Masa a la piedra gruesa";
        salsa = "Salsa de Tomate";
        ingredientes.add("Peperoni");
        ingredientes.add("Extra queso mozzarella");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 50 min. a 55°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños rectángulos");
    }
}
