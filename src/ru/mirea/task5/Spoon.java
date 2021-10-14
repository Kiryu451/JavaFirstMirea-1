package ru.mirea.task5;

public class Spoon extends Dish{
    private int length;
    public Spoon(int length, String material){
        super(material);
        this.length = length;
    }
    public void display(){
        System.out.printf("Spoon{ length: " + length + " material: " + super.getMaterial() + "}\n");
    }
}
