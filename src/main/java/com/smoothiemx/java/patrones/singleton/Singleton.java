package com.smoothiemx.java.patrones.singleton;

public class Singleton {

    public static void main(String[] args) {

        ConexionDBSingleton conn = null;

        for (int i = 0; i < 10; i++) {
             conn = ConexionDBSingleton.getInstancia();
            System.out.println("conn = " + conn);
        }

        ConexionDBSingleton conn2 = ConexionDBSingleton.getInstancia();
        ConexionDBSingleton conn3 = ConexionDBSingleton.getInstancia();

        boolean b1 = ((conn == conn2) && (conn2 == conn3) && (conn == conn3));
        System.out.println("b1 = " + b1);
    }
}