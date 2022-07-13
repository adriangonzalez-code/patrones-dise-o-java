package com.smoothiemx.java.patrones.decorator.decorador;

import com.smoothiemx.java.patrones.decorator.Formateable;

public abstract class TextDecorador implements Formateable {

    protected Formateable texto;

    public TextDecorador(Formateable texto) {
        this.texto = texto;
    }
}
