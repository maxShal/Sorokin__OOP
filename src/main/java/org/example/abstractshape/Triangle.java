package org.example.abstractshape;

import org.example.Shape;

import static java.lang.Math.sqrt;

public class Triangle implements Shape {

    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c)
    {
        checkSide(a, b, c);
        checkSide(b, c, a);
        checkSide(c, b, a);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void checkSide(double a, double b, double c)
    {
        if(b+c<=a){
            throw new IllegalArgumentException("Не является  треугольником");
        }
        if(a<=0 )
        {
            throw new IllegalArgumentException("Сторона меньше либо равна 0");
        }
    }

    @Override
    public double getArea() {
        double s = getPerimeter()/2;
        return sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
