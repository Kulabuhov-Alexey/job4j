package ru.job4j.array;
/**
 * Сортируем массив методом пузырька.
 */
public class BubbleSort {
    /**
     *
     * @param array массив который необходимо отсортировать.
     * @return отсортированный массив.
     */
    public int[] sort(int[] array) {
            for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                }
            }
        }
        return array;
    }
}
