package org.example;

import org.example.abstractshape.Ellipse;
import org.example.abstractshape.Rectangle;
import org.example.abstractshape.Triangle;
import org.example.generalshape.Circle;
import org.example.generalshape.RegularTriangle;
import org.example.generalshape.Square;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[60];
        int index = 0;

        // Создаем 10 экземпляров каждого класса и добавляем в массив
        for (int i = 1; i < 11; i++) {
            shapes[index++] = new Circle(i);
            shapes[index++] = new Square(i);
            shapes[index++] = new Triangle(i,i+1,i+1.5);
            shapes[index++] = new Rectangle(i,i+1);
            shapes[index++] = new Ellipse(i,i+1);
            shapes[index++] = new RegularTriangle(i);
        }
        double result_A =0;
        double result_P =0;
        for (int i =0;i<60;i++)
        {

            result_A+=shapes[i].getArea();
            result_P+=shapes[i].getPerimeter();
        }

        double t_result_A =0;
        double t_result_P =0;
        double r_result_A =0;
        double r_result_P =0;

        for (int i =0;i<60;i++)
        {
            if (shapes[i].getClass().equals(Triangle.class))
            {
                t_result_A+=shapes[i].getArea();
                t_result_P+=shapes[i].getPerimeter();
            } else if (shapes[i].getClass().equals(Rectangle.class)) {
                r_result_A+=shapes[i].getArea();
                r_result_P+=shapes[i].getPerimeter();
            }

        }

        System.out.println("Суммарная площадь всех фигур: " + result_A);
        System.out.println("Суммарный периметр всех фигур: " + result_P);

        System.out.println("Суммарная площадь Triangle: " + t_result_A);
        System.out.println("Суммарный периметр Triangle: " + t_result_P);

        System.out.println("Суммарная площадь Rectangle: " + r_result_A);
        System.out.println("Суммарный периметр Rectangle: " + r_result_A);

      /*  Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        Circle circle3 = new Circle(3);
        Circle circle4 = new Circle(4);
        Circle circle5 = new Circle(5);
        Circle circle6 = new Circle(6);
        Circle circle7 = new Circle(7);
        Circle circle8 = new Circle(8);
        Circle circle9 = new Circle(9);
        Circle circle10 = new Circle(10);

        Ellipse ellipse1 = new Ellipse(1,2);
        Ellipse ellipse2 = new Ellipse(1,3);
        Ellipse ellipse3 = new Ellipse(1,4);
        Ellipse ellipse4 = new Ellipse(1,5);
        Ellipse ellipse5 = new Ellipse(1,6);
        Ellipse ellipse6 = new Ellipse(1,7);
        Ellipse ellipse7 = new Ellipse(1,8);
        Ellipse ellipse8 = new Ellipse(1,9);
        Ellipse ellipse9 = new Ellipse(1,10);
        Ellipse ellipse10 = new Ellipse(1,11);
*/


    }
}