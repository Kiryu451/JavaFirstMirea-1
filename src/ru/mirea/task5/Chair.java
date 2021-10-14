package ru.mirea.task5;

public class Chair extends Furniture {
    private int prise;
    public Chair(int prise, String material, String manufacture){
        super(material, manufacture);
        this.prise = prise;
    }
    public void display(){
        System.out.printf("Chair{ prise: " + prise + " material: " + super.getMaterial() + " manufacture: " + super.getManufacture() + "}\n");
    }
}
