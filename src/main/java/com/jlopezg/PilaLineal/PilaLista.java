package com.jlopezg.PilaLineal;

/**
 * @author JorgeLopez
 */

public class PilaLista {

    /**
     * @MAX_SIZE = Indica el tamaño fijo que tendrá la pila, en este caso 40
     * @cima = Puntero que guarda la posición del último y más reciente valor
     *       agregado a la pila
     * @listaPila = Array de objectos que se almacenarán en la pila
     */
    private static final int MAX_SIZE = 40;
    private int cima;
    private Object[] listaPila;

    // Constructor (es)
    public PilaLista() {
        this.cima = -1;
        this.listaPila = new Object[MAX_SIZE];
    }

    // Métodos que alteran la pila

    // push - agregar
    public void insertar(Object elemento) throws Exception {
        if (pilaLlena()) {
            throw new Exception("StackOverFlow, se llenó");
        }

        cima++;
        listaPila[cima] = elemento;
    }

    // pop - Quitar
    public Object quitar() throws Exception {
        Integer aux;

        if (pilaVacia()) {
            throw new Exception("StackUnderFlow, se vació");
        }

        // Guardar el valor de la cima
        aux = (Integer) listaPila[cima];

        // Decrementar la cima y retornar el elemento
        cima--;
        return aux;
    }

    // Limpiar la pila
    public void limpiarPila() throws Exception {
        cima = -1;
    }

    // Acceso a la cima de la pila
    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede completar la acción");
        }

        return listaPila[cima];
    }

    // Métodos de verificación
    public boolean pilaLlena() {
        return cima == (MAX_SIZE - 1);
    }

    public boolean pilaVacia() {
        return cima == -1;
    }

}
