package ru.mirea.task5;

public class Fork extends Dish {
    private int prongs;
    public Fork(String material){
        super(material);
        prongs = 3;
    }

    public void setProngs(int prongs) {
        this.prongs = prongs;
    }

    public void display(){
        System.out.printf("Fork{ prongs: " + prongs + " material: " + super.getMaterial() + "}\n");
    }
}
