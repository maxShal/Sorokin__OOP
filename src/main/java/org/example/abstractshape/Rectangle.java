package org.example.abstractshape;

import org.example.Shape;

public class Rectangle implements Shape {

    private final double a;
    private final double b;

    public Rectangle( double a, double b)
    {
        if(a<=0 || b<=0)
        {
            throw new IllegalArgumentException("less 0");
        }
        this.a =a;
        this.b =b;
    }
    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {

        return 2*(a+b);
    }
}
