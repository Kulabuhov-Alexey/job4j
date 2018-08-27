package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Alexey Kulabuhov (mailto:jkulabuha@yandex.ru)
* @version 1.0
* @since 27.08.2018
*/
public class CalculateTest {
/**
* Test echo.
*/
@Test
public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Alexey Kulabuhov";
    String expect = "Echo, echo, echo : Alexey Kulabuhov";
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}

}
