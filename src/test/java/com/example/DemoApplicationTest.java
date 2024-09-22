package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DemoApplicationTest {

    @Test
    public void testAddSuccess() {
        DemoApplication app = new DemoApplication();
        int result = app.add(4, 2);
        assertEquals(6, result); // 4 + 2 = 6
    }

    @Test
    public void testSubSuccess() {
        DemoApplication app = new DemoApplication();
        int result = app.sub(4, 2);
        assertEquals(2, result); // 4 - 2 = 2
    }

    @Test
    public void testMulSuccess() {
        DemoApplication app = new DemoApplication();
        int result = app.mul(4, 2);
        assertEquals(8, result); // 4 * 2 = 8
    }
}
