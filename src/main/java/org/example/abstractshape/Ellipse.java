package org.example.abstractshape;

import org.example.Shape;

public class Ellipse implements Shape {

    private final double small_axis;
    private final double big_axis;

    public Ellipse(double small_axis, double big_axis)
    {
        if(big_axis<=0||small_axis<=0)
        {
            throw new IllegalArgumentException("ось <= 0");
        }
        this.big_axis =big_axis;
        this.small_axis=small_axis;
    }
    @Override
    public double getArea() {
        return Math.PI*small_axis*big_axis;
    }

    @Override
    public double getPerimeter() {return 4 * ((Math.PI * small_axis * big_axis+ (big_axis - small_axis))/(big_axis - small_axis));
    }
}
