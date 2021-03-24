import test.Calculator;
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2,3));
        System.out.println(calc.rest(2,3));
        System.out.println(calc.multi(2,3));
        System.out.println(calc.div(2,3));
    }
}
