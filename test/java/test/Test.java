package test;

import org.junit.jupiter.api.Assertions;

public class Test {
    @org.junit.jupiter.api.Test
    void test() {
        Calculator calc = new Calculator();
        calc.sum(2,1);
        float sum = calc.getResultado();
        //Realiza el test de la variable suma
        Assertions.assertEquals(3.0,sum);
        calc.rest(2,1);
        float rest = calc.getResultado();
        //Realiza el test de la variable resta
        Assertions.assertEquals(1.0,rest);
    }
}
