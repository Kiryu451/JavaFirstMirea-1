package ru.mirea.task5;
import javax.swing.*;

abstract class Furniture {
    private String material;
    public String manufacture;

    public Furniture(String material, String manufacture){
        this.material = material;
        this.manufacture = manufacture;
    }

    public String getMaterial() { return material; }

    public String getManufacture() { return manufacture; }
}
