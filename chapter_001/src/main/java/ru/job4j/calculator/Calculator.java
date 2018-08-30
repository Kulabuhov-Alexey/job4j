package ru.job4j.calculator;
/**
 * Calculator. Сложение, деление, вычитание, умножение двух чисел.
 *
 * @author Alexey Kulabuhov (mailto:jkulabuha@yandex.ru)
 */
class Calculator {

    private double result;
    /**
     * Method add.
     * @param first First number.
     * @param second Second number.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * Method subtract.
            * @param first First number.
     * @param second Second number.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }
    /**
     * Method div.
     * @param first First number.
     * @param second Second number.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
    /**
     * Method multiply.
     * @param first First number.
     * @param second Second number.
     */
    public void multiply(double first, double second) {
        this.result = first * second;
    }
    /**
     * Method getResult.
     * @return  result
     */
    double getResult() {
        return this.result;
    }
}

