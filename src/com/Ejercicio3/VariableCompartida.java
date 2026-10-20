package com.Ejercicio3;

public class VariableCompartida {
        private int v;

        public VariableCompartida() {
            this.v = 0;
        }

        public /*synchronized*/ int getV() {
            return v;
        }
        public /*synchronized*/ void setV(int v) {
                this.v = v;
        }
        public void incrementar() {
            v++;
        }
}
