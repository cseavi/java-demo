package tech.dipc.javademo;

import org.junit.Test;

public class CalculationTest {


    @Test
    public void testCalculationWithPositiveValues() {

        int expected = 20;
        int actual = 0;

        Calculation calculation = new Calculation();

        actual = calculation.calculate(10, 20, 30);

        org.junit.Assert.assertEquals(expected, actual);

    }

    @Test
    public void testCalculationWithZeroValues() {

        int expected = 13;
        int actual = 0;

        Calculation calculation = new Calculation();

        actual = calculation.calculate(0, 20, 30);

        org.junit.Assert.assertEquals(expected, actual);

    }


}
