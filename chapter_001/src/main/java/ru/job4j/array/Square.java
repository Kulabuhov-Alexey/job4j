package ru.job4j.array;
/**
 * Возводим в квадрат числа и записываем их в массив.
 */
public class Square {
    /**
     *
     * @param bound количество чисел в массиве.
     * @return требуемый массив.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i  = 1; i <= bound; i++) {
            rst[i - 1] = i * i;
        }
        return rst;
    }
}
