package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

/**
 * Point. Расчет расстояния между точками".
 *
 * @author Alexey Kulabuhov (mailto:jkulabuha@yandex.ru)
 */
public class Point {
    /**
     * @param x x-coordinate.
     * @param y y-coordinate.
     */
    private int x;
    private int y;
    /**
     * Constructor Point.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Method distanceTo.
     * @param that точка до которой будем определять расстояние.
     * @return  расстояние между точками.
     */
    public double distanceTo(Point that) {
        return sqrt(pow(that.x - this.x, 2) + pow(that.y - this.y, 2));
    }
}
