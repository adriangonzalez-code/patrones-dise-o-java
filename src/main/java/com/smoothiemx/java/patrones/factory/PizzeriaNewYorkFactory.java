package com.smoothiemx.java.patrones.factory;

import com.smoothiemx.java.patrones.factory.producto.PizzaNewYorkItaliana;
import com.smoothiemx.java.patrones.factory.producto.PizzaNewYorkPeperoni;
import com.smoothiemx.java.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {

    @Override
    PizzaProducto crearPizza(String tipo) {

        PizzaProducto producto = null;

        switch (tipo) {
            case "vegetariana":
                producto = new PizzaNewYorkVegetariana();
                break;

            case "peperoni":
                producto = new PizzaNewYorkPeperoni();
                break;

            case "italiana":
                producto = new PizzaNewYorkItaliana();
                break;

        }
        return producto;
    }
}
