package com.smoothiemx.java.patrones.decorator.decorador;

import com.smoothiemx.java.patrones.decorator.Formateable;

public class MayusculaDecorador extends TextDecorador {

    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
