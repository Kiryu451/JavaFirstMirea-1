package ru.mirea.task3;

public class Head {
    private double height;
    private double width;
    private int weight;

    public Head(double h, double w, int we){
        height = h;
        width = w;
        weight = we;
    }

    public double getHeadHeight(){
        return height;
    }

    public double getHeadWidth() {
        return width;
    }

    public int getHeadWeight() {
        return weight;
    }
}
