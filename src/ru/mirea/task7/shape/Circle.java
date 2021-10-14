package ru.mirea.task7.shape;
import java.math.*;

public class Circle extends Shape{
    protected double radius;
    Circle(){
        radius = 3.2;
    }

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public double getArea() {
        return 3.14 * Math.pow(radius, 2);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
