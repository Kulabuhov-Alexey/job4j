package ru.job4j.array;
/**
 * Проверяем диагонали на заполнение одинаковыми элементами.
 */
public class MatrixCheck {
    /**
     *
     * @param data матрица для проверки диагоналей.
     * @return все диагонали содержат одинаковые элементы.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        boolean tmp = data[0][0];
        for (int i = 0; i < data.length; i++) {
            if ((tmp != data[i][i]) ||  (tmp != data[data.length - 1 - i][i])) {
                result = false;
            }
        }
        return result;
    }
}
