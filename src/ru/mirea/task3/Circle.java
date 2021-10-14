package ru.mirea.task3;

public class Circle {
    private int radius;
    private String color;

    public Circle(int r, String c){
        radius = r;
        color = c;
    }

    public int getRadius(){
        return radius;
    }

    public String getColor() {
        return color;
    }
}
