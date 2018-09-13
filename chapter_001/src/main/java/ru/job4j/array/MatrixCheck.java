package ru.job4j.array;
/**
 * Проверяем диагонали на заполнение одинаковыми элементами.
 */
public class MatrixCheck {
    /**
     *
     * @param data матрица для проверки диагоналей.
     * @return заполнена ли хотябы одна диагональ одинаковыми элементами.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        boolean result2 = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0][0] != data[i][i]) {
                result = false;
            }
            if (data[0][data.length - 1] != data[i][data.length - i - 1]) {
                result2 = false;
            }
        }
        return result || result2;
    }
}
