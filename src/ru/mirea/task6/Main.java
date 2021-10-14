package ru.mirea.task6;

public class Main {
    public static void main(String[] args){
        Nameable IHaveNoFantasy = new NotWork();
        IHaveNoFantasy.getNames();
        Priceable IHaveNoFantasy2 = new Price();
        IHaveNoFantasy2.getPrice();
    }
}
