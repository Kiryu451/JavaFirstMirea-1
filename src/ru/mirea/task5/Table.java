package ru.mirea.task5;

public class Table extends Furniture{
    private int prise;
    public Table(int prise, String material, String manufacture){
        super(material, manufacture);
        this.prise = prise;
    }
    public void display(){
        System.out.printf("Table{ prise: " + prise + " material: " + super.getMaterial() + " manufacture: " + super.getManufacture() + "}\n");
    }
}
