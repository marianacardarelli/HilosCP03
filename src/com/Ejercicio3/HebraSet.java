package com.Ejercicio3;

public class HebraSet implements Runnable {
    private VariableCompartida compartida;

    public HebraSet(VariableCompartida v) {
        this.compartida = v;
    }

    @Override
    public void run() {
        for  (int i = 0; i < 100; i++) {
            compartida.setV(i);
            System.out.println("Escrito: "+ i);
        }
    }
}
