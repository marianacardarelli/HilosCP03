package com.Ejercicio3;

public class Test {
    public static void main(String[] args) {
        VariableCompartida v = new VariableCompartida();
        HebraSet h1 = new HebraSet(v);
        HebraGet h2 = new HebraGet(v);

        Thread escribir = new Thread(h1);
        Thread leer = new Thread(h2);

        escribir.start();
        leer.start();
    }
}
