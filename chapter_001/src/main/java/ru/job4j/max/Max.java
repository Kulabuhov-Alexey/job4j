package ru.job4j.max;
/**
 * Находим максимум из 2-х или 3-х чисел.
 */
public class Max {
    /**
     * Находим максимум из 2-х чисел.
     * @param first первое число.
     * @param second второе число.
     * @return максимум из 2-х чисел.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }
    /**
     * Находим максимум из 3-х чисел.
     * @param first первое число.
     * @param second второе число.
     * @param third третье число.
     * @return максимум из 3-х чисел.
     */
    public int max(int first, int second, int third) {
        return max(max(first, second), third);
    }
}
