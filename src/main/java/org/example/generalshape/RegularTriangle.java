package org.example.generalshape;

import org.example.abstractshape.Triangle;

public class RegularTriangle extends Triangle {

    private double a;

    public RegularTriangle(double a) {
        super(a, a, a);
    }

    @Override
    public double getArea()
    {
        return (Math.sqrt(3)/4)*(a*a);
    }

    @Override
    public double getPerimeter()
    {
        return 3*a;
    }
}
