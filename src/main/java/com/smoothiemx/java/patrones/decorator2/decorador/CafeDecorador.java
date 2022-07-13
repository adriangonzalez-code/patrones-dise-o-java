package com.smoothiemx.java.patrones.decorator2.decorador;

import com.smoothiemx.java.patrones.decorator2.Configurable;

public abstract class CafeDecorador implements Configurable {

    protected Configurable cafe;

    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }
}