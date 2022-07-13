package com.smoothiemx.java.patrones.decorator.decorador;

import com.smoothiemx.java.patrones.decorator.Formateable;

public class SubrayadoDecorador extends TextDecorador {

    public SubrayadoDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        int largo = texto.darFormato().length();
        StringBuilder sb = new StringBuilder(texto.darFormato());
        sb.append("\n");

        for (int i = 0; i < largo; i++) {
            sb.append("_");
        }

        return sb.toString();
    }
}