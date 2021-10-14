package ru.mirea.task3;

public class Leg {
    private double height;
    private double width;
    private int weight;

    public Leg(double h, double w, int we){
        height = h;
        width = w;
        weight = we;
    }

    public double getLegHeight(){
        return height;
    }

    public double getLegWidth() {
        return width;
    }

    public int getLegWeight() {
        return weight;
    }
}
