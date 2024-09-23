package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DemoApplicationTest {

    @Test
    public void testAddFail() {
        DemoApplication app = new DemoApplication();
        int result = app.add(4, 2);
        assertEquals(7, result); // Intentional fail case: 4 + 2 != 7
    }

    @Test
    public void testSubFail() {
        DemoApplication app = new DemoApplication();
        int result = app.sub(4, 2);
        assertEquals(3, result); // Intentional fail case: 4 - 2 != 3
    }

    @Test
    public void testMulFail() {
        DemoApplication app = new DemoApplication();
        int result = app.mul(4, 2);
        assertEquals(10, result); // Intentional fail case: 4 * 2 != 10
    }
}
