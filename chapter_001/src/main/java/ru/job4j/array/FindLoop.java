package ru.job4j.array;
/**
 * Ищем нужный элемент в массиве и возвращаем его индекс.
 */
public class FindLoop {
    /**
     *
     * @param data массив где ищем элемент.
     * @param el элемент индекс которого нужно найти.
     * @return индекс искомого элемента.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
