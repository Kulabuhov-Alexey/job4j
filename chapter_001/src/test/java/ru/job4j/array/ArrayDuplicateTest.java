package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Alexey Kulabuhov (mailto:jkulabuha@yandex.ru)
 * @version 1.0
 * @since 16.09.2018
 */
public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate newArr = new ArrayDuplicate();
        String[] arrayNew = new String[] {"hi", "one", "hi", "well", "well"};
        String[] resultArray = newArr.remove(arrayNew);
        String[] expectArray = new String[] {"hi", "one", "well"};
        assertThat(resultArray, arrayContainingInAnyOrder(expectArray));
    }
}
