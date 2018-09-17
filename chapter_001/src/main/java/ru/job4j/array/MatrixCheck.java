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
        boolean result;
        if (data.length % 2 == 0) {
            result = check(data, 'l') || check(data, 'r');
        } else {
            result = check(data, 'l') && check(data, 'r');
        }
        return result;
    }

    /**
     *
     * @param data массив где проверяем диагонали.
     * @param d какую диагональ проверяем (левую или правую).
     * @return совпадают ли элементы в проверяемой диагонали.
     */
    public boolean check(boolean[][] data, char d) {
        boolean result = true;
        if (d == 'l') {
            for (int i = 1; i < data.length; i++) {
                if (data[0][0] != data[i][i]) {
                    result = false;
                }
            }
        } else if (d == 'r') {
            for (int i = 1; i < data.length; i++) {
                if (data[0][data.length - 1] != data[data.length - 1 - i][i]) {
                    result = false;
                }
            }
        }

        return result;
    }
}