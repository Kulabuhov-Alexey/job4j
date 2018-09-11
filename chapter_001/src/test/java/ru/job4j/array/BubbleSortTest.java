package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Alexey Kulabuhov (mailto:jkulabuha@yandex.ru)
 * @version 1.0
 * @since 11.09.2018
 */
public class BubbleSortTest {
    @Test
    public void whenArraySort() {
        int[] input = new int[] {4, 1, 6, 2};
        BubbleSort array = new BubbleSort();
        int[] result = array.sort(input);
        int[] expect = new int[] {1, 2, 4, 6};

        assertThat(result, is(expect));
    }

    @Test
    public void whenArraySort2() {
        int[] input = new int[] {4, 1, 6, 2, 4, 1, 6, 2};
        BubbleSort array = new BubbleSort();
        int[] result = array.sort(input);
        int[] expect = new int[] {1, 1, 2, 2, 4, 4, 6, 6};

        assertThat(result, is(expect));
    }

    @Test
    public void whenArraySort3() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        BubbleSort array = new BubbleSort();
        int[] result = array.sort(input);
        int[] expect = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertThat(result, is(expect));
    }
}
