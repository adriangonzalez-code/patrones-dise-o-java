package com.smoothiemx.java.patrones.decorator.decorador;

import com.smoothiemx.java.patrones.decorator.Formateable;

public class RemplazarEspacioDecorador extends TextDecorador {

    public RemplazarEspacioDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ", "_");
    }
}
