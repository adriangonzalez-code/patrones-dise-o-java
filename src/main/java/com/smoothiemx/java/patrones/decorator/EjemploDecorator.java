package com.smoothiemx.java.patrones.decorator;

import com.smoothiemx.java.patrones.decorator.decorador.MayusculaDecorador;
import com.smoothiemx.java.patrones.decorator.decorador.RemplazarEspacioDecorador;
import com.smoothiemx.java.patrones.decorator.decorador.ReversaDecorador;
import com.smoothiemx.java.patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorator {

    public static void main(String[] args) {

        Formateable texto = new Texto("Hola que tal Adrián!");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);
        RemplazarEspacioDecorador reemplazar = new RemplazarEspacioDecorador(subrayar);

        System.out.println(reemplazar.darFormato());
    }
}