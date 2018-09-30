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
        for (int i = 1; i < data.length; i++) {
            if (data[0][0] != data[i][i] || data[0][data.length - 1] != data[data.length - 1 - i][i]) {
                result = false;
                break;
            }
        }
        return result;

    }
}