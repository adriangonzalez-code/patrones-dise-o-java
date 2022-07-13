package com.smoothiemx.java.patrones.factory;

import com.smoothiemx.java.patrones.factory.producto.PizzaCaliformaPeperoni;
import com.smoothiemx.java.patrones.factory.producto.PizzaCaliformaQueso;
import com.smoothiemx.java.patrones.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCalifornaFactory extends PizzeriaZonaAbstractFactory {
    @Override
    PizzaProducto crearPizza(String tipo) {

        PizzaProducto producto = null;

        switch (tipo) {
            case "queso":
                producto = new PizzaCaliformaQueso();
                break;

            case "peperoni":
                producto = new  PizzaCaliformaPeperoni();
                break;

            case "vegetariana":
                producto = new PizzaCaliforniaVegetariana();
                break;
        }

        return producto;
    }
}
