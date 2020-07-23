package tech.dipc.javademo;

public class Calculation {

    public Integer calculate(int a, int b, int c) {

        int result = 0;

        result = a + b; //20
        result = result * b;
        result = result / c;

        return result;
    }

}
