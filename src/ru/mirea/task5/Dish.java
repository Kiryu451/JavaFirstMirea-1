package ru.mirea.task5;

abstract class Dish {
    private String material;

    public Dish(String material){
        this.material = material;
    }

    public String getMaterial() { return material; }
    public abstract void display();
}
