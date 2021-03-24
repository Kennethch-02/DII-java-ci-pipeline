package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Calculator {
    private float resultado;
    @Test
    void name() {
        Assertions.assertEquals(1, 1);
    }
    public float sum(int var1, int var2) {
        this.resultado = var1 + var2;
        return this.resultado;
    }
    public float rest(int var1, int var2){
        this.resultado = var1 - var2;
        return this.resultado;
    }
    public float multi(int var1, int var2){
        this.resultado = var1 * var2;
        return this.resultado;
    }
    public float div(int var1, int var2){
        this.resultado = (float)var1/var2;
        return this.resultado;
    }
    public float getResultado(){
        return this.resultado;
    }
}
