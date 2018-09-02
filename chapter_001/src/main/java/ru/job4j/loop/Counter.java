package ru.job4j.loop;
/**
 * Считаем четные числа в диапазоне.
 */
public class Counter {
    /**
     * Конвертируем рубли в евро.
     * @param start нижняя граница диапазона.
     * @param finish верхняя граница диапазона.
     * @return сумму четных чисел.
     */
    public int add(int start, int finish) {
        int summa = 0; // переменная для хранения суммы четных чисел.
        for (int i = start; i <= finish; i++) {
         if (i % 2 == 0) {
             summa += i;
         }
        }
    return summa;
    }
}
