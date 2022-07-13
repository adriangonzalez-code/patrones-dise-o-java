package com.smoothiemx.java.patrones.factory.producto;

import com.smoothiemx.java.patrones.factory.PizzaProducto;

public class PizzaCaliformaQueso extends PizzaProducto {

    public PizzaCaliformaQueso() {
        super();
        nombre = "Pizza Califorma Queso";
        masa = "Masa a la piedra delgada";
        salsa = "Salsa de tomate rucula";
        ingredientes.add("Extra queso Mozzarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Queso azul");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 35 min. a 100°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños triángulos");
    }
}
