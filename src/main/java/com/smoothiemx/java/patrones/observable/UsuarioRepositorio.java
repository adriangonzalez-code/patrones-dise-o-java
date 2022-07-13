package com.smoothiemx.java.patrones.observable;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio extends Observable {

    private List<String> repositorios = new ArrayList<>();

    public void crearUsuario(String usuario) {
        repositorios.add(usuario);
        notifyObservers(usuario);
    }
}
