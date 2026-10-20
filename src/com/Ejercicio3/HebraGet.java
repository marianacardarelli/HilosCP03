package com.Ejercicio3;

public class HebraGet implements Runnable {
    private VariableCompartida compartida;
    public HebraGet(VariableCompartida v) {
        this.compartida = v;

    }

    @Override
    public void run() {
        for (int i=0; i<100; i++){
            System.out.println("La variable vale: "+ compartida.getV() );
        }
    }
}
