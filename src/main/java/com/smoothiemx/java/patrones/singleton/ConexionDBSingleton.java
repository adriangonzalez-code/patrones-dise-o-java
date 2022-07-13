package com.smoothiemx.java.patrones.singleton;

public class ConexionDBSingleton {

    private static ConexionDBSingleton instancia;

    private ConexionDBSingleton() {
        System.out.println("Conectándose a un motor de Base de Datos");
    }

    public static ConexionDBSingleton getInstancia() {

        if (ConexionDBSingleton.instancia == null) {
            ConexionDBSingleton.instancia = new ConexionDBSingleton();
        }
        return ConexionDBSingleton.instancia;
    }
}