package ru.job4j.array;
/**
 * Проверяем однородность элемента массива.
 */
public class Check {
    /**
     *
     * @param data массив, элементы которого нужно проверить.
     * @return однородный массив или нет.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
            result = false;
            break;
            }
        }
        return result;
    }
}
