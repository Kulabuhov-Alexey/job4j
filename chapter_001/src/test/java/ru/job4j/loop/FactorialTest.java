package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Alexey Kulabuhov (mailto:jkulabuha@yandex.ru)
 * @version 1.0
 * @since 03.09.2018
 */
public class FactorialTest {

    @Test
    public void factorialOfFive() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void factorialofZero() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        assertThat(result, is(1));
    }
}
