package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test calculator task.
 *
 * @author Alexey Kulabuhov (mailto:jkulabuha@yandex.ru)
 * @version 1.0
 * @since 30.08.2018
 */
public class CalculatorTest {
    /**
     * Test add.
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test div.
     */
    @Test
    public void whenDivTwoOnFourThenZeroFive() {
        Calculator calc = new Calculator();
        calc.div(2D, 4D);
        double result = calc.getResult();
        double expected = 0.5D;
        assertThat(result, is(expected));
    }
    /**
     * Test subtract.
     */
    @Test
    public void whenSubOneMinusTwoThenMinusOne() {
        Calculator calc = new Calculator();
        calc.subtract(1D, 2D);
        double result = calc.getResult();
        double expected = -1D;
        assertThat(result, is(expected));
    }
    /**
     * Test multiply.
     */
    @Test
    public void whenMultiplyOneOnOneThenOne() {
        Calculator calc = new Calculator();
        calc.multiply(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
}