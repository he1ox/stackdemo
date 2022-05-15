package com.jlopezg.PilaVector;

import java.util.ArrayList;

public class PilaVector {
    private int cima;
    private ArrayList<Object> listaPila;

    public PilaVector() {
        this.cima = -1;
        this.listaPila = new ArrayList<>();
    }

    public void insertar(Object elemento) throws Exception {
        cima++;
        listaPila.add(elemento);
    }

    public Object quitar() throws Exception {
        Object aux;

        if (pilaVacia()) {
            throw new Exception("pila esta vacia");
        }

        aux = listaPila.get(cima);
        listaPila.remove(cima);
        cima--;
        return aux;
    }

    // Acceso a la cima de la pila
    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede completar la acción");
        }

        return listaPila.get(cima);
    }


    public void limpiarPila() throws Exception{
        while (!pilaVacia()) {
            quitar();
        }
    }

    private boolean pilaVacia() {
        return cima == -1;
    }

}
