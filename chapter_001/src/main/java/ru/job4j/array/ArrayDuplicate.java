package ru.job4j.array;

import java.util.Arrays;
/**
 * Удаляем дубликаты.
 */
public class ArrayDuplicate {
    /**
     *
     * @param array массив с дубликатами.
     * @return массив без дубликатов.
     */
    public String[] remove(String[] array) {
        int countDublicate = 0;
        for (int i = 0; i < array.length - countDublicate - 1; i++) {
            for (int j = i + 1; j < array.length - countDublicate; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[array.length - countDublicate - 1];
                    countDublicate++;
                }
            }
        }
        return Arrays.copyOf(array, array.length - countDublicate);
    }
}
