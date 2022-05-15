package com.jlopezg;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

import com.jlopezg.PilaLineal.PilaLista;

public class Pila {

    static void ejemploCero() {
        // Creando un stack vacío
        Stack<Integer> miPila = new Stack<>();

        // Método add para agregar elementos al stack
        miPila.push(10);
        miPila.push(15);
        miPila.push(30);
        miPila.push(20);
        miPila.push(5);

        // Desplegando el stack
        System.out.println("Pila Inicial: " + miPila);

        // Quitando elementos usando método pop()
        System.out.println("Elemento desapilado : " + miPila.pop());
        System.out.println("Element desapilado: " + miPila.pop());

        // Desplegando el stack despues de aplicar el metodo pop()
        System.out.println("Pila final : " + miPila);
    }

    static void ejercicioPilas() {
        PilaLista pila;
        int x;
        final int CLAVE = -1;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Tecle los elementos, termine con -1");


        try {
            pila = new PilaLista();
            do {
                x = Integer.parseInt(entrada.readLine());
                pila.insertar(x);
            } while (x != CLAVE);

            System.out.println("Elementos de la pila");
    
            while (!pila.pilaVacia()) {
                x = (Integer) (pila.quitar());
                System.out.println(x + " ");
            }

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace(System.out);
        }

    }

    static void ejercicioVector() {
        PilaLista pila;
        int x;
        final int CLAVE = -1;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Tecle los elementos, termine con -1");


        try {
            pila = new PilaLista();
            do {
                x = Integer.parseInt(entrada.readLine());
                pila.insertar(x);
            } while (x != CLAVE);

            System.out.println("Elementos de la pila");
    
            while (!pila.pilaVacia()) {
                x = (Integer) (pila.quitar());
                System.out.println(x + " ");
            }

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    static void ejercicioPilaLista() {
        PilaLista pila;
        int x;
        final int CLAVE = -1;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Tecle los elementos, termine con -1");


        try {
            pila = new PilaLista();
            do {
                x = Integer.parseInt(entrada.readLine());
                pila.insertar(x);
            } while (x != CLAVE);

            System.out.println("Elementos de la pila");
    
            while (!pila.pilaVacia()) {
                x = (Integer) (pila.quitar());
                System.out.println(x + " ");
            }

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public static void main(String[] args) {
        //ejercicioPilas();
        //ejercicioVector();
        ejercicioPilaLista();
    }
}
