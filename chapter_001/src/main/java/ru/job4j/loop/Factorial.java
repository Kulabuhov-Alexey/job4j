package ru.job4j.loop;
/**
 * Считаем факториал.
 */
public class Factorial {
    /**
     * Считаем факториал числа.
     * @param n число для которого ищем факториал.
     * @return факториал.
     */
    public int calc(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return  factorial;
    }
}
