package org.example.abstractshape;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;

public class RectangleTest extends TestCase {

    private final Rectangle rectangle = new Rectangle(2,4);

    @Test
    public void testGetArea() {
        assertEquals(8.0,rectangle.getArea());
    }

    @Test
    public void testGetAreafalse() {
        assertNotEquals(0,rectangle.getArea());
    }

    @Test
    public void testzero()
    {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 4));
    }

    @Test
    public void testGetPerimeter() {
        assertEquals(12.0,rectangle.getPerimeter());
    }

    @Test
    public void testGetPerimeterfalse() {
        assertNotEquals(0,rectangle.getPerimeter());
    }

}