package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test point task.
 *
 * @author Alexey Kulabuhov (mailto:jkulabuha@yandex.ru)
 * @version 1.0
 * @since 01.09.2018
 */
public class PointTest {
    /**
     * Test distance from A to B.
     */
    @Test
    public void fromAToB() {
        Point pointA = new Point(1, 1);
        Point pointB = new Point(1, 3);
        double result = pointA.distanceTo(pointB);
        double expected = 2D;
        assertThat(result, is(expected));
    }

}
