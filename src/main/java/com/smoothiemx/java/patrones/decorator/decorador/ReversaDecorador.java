package com.smoothiemx.java.patrones.decorator.decorador;

import com.smoothiemx.java.patrones.decorator.Formateable;

public class ReversaDecorador extends TextDecorador {

    public ReversaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(texto.darFormato());
        return sb.reverse().toString();
    }
}
