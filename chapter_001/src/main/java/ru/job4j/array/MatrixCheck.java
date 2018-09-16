package ru.job4j.array;

/**
 * Проверяем диагонали на заполнение одинаковыми элементами.
 */
public class MatrixCheck {
    /**
     * @param data матрица для проверки диагоналей.
     * @return все диагонали содержат одинаковые элементы.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        boolean tmp = data[0][0];
        if (data.length > 2) {
            for (int i = 0; i < data.length; i++) {
                if ((tmp != data[i][i]) || (tmp != data[data.length - 1 - i][i])) {
                    result = false;
                }
            }
        } else if (data[0][0] != data[1][1] && data[1][0] != data[0][1]) {
            result = false;
        }
        return result;
    }
}