package ru.mirea.task3;

public class Hand {
    private double height;
    private double width;
    private int weight;

    public Hand(double h, double w, int we){
        height = h;
        width = w;
        weight = we;
    }

    public double getHandHeight(){
        return height;
    }

    public double getHandWidth() {
        return width;
    }

    public int getHandWeight() {
        return weight;
    }
}
