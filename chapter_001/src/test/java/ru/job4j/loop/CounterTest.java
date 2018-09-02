package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Alexey Kulabuhov (mailto:jkulabuha@yandex.ru)
 * @version 1.0
 * @since 02.09.2018
 */
public class CounterTest {
    /**
     * Test add.
     */
    @Test
    public void whenTakeNameThenTreeEchoPlusName() {
        Counter count = new Counter();
        int result = count.add(1, 10);
        assertThat(result, is(30));
    }
}
