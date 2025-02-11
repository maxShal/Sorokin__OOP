package org.example.abstractshape;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;

public class TriangleTest extends TestCase {

    private final Triangle triangle = new Triangle(3,4,5);

    @Test
    public void testGetArea() {
        assertEquals(6.0,triangle.getArea());//changes
    }

    @Test
    public void testGetAreafalse() {
        assertNotEquals(0,triangle.getArea());
    }
    @Test
    public void testGetPerimeter() {
        assertEquals(12.0,triangle.getPerimeter());
    }

    @Test
    public void testGetPerimeterfalse() {
        assertNotEquals(0,triangle.getPerimeter());
    }

    @Test
    public void testzero()
    {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0, 4,1));
    }

    @Test
    public void testwrongtriangle()
    {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 4,1));
    }
}