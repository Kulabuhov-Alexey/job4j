package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Test.
 *
 * @author Alexey Kulabuhov (mailto:jkulabuha@yandex.ru)
 * @version 1.0
 * @since 08.09.2018
 */
public class PaintTest {
    @Test
    public void whenPyramid4Height() {
        Paint paint = new Paint();
        String rst = paint.pyramid(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^   ")
                                .add("  ^^^  ")
                                .add(" ^^^^^ ")
                                .add("^^^^^^^")
                                .toString()
                )
        );
    }
    @Test
    public void whenPyramid5Height() {
        Paint paint = new Paint();
        String rst = paint.pyramid(5);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("    ^    ")
                                .add("   ^^^   ")
                                .add("  ^^^^^  ")
                                .add(" ^^^^^^^ ")
                                .add("^^^^^^^^^")
                                .toString()
                )
        );
    }
}

