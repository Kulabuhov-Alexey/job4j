package ru.job4j.array;
/**
 * Переворачиваем массив.
 */
public class Turn {
    /**
     *
     * @param array массив, который нужно перевернуть.
     * @return перевернутый массив.
     */
    public int[] turn(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return array;
    }
}
