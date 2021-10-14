package ru.mirea.task5;

public class Main {
    public static void main(String[] args){
        Spoon mySpoon = new Spoon(23, "silver");
        mySpoon.display();
        Fork myFork = new Fork("aluminum");
        myFork.display();
        myFork.setProngs(4);
        myFork.display();
        Pinscher_and_Schnauzer dog1 = new Pinscher_and_Schnauzer("Mike");
        dog1.display();
        dog1.setWeight(43);
        dog1.display();
        Small_Terriers dog2 = new Small_Terriers("Biba");
        dog2.display();
        Chair myChair = new Chair(850, "wood", "IKEA");
        myChair.display();
        Table myTable = new Table(5000, "glass", "OtherManuf");
        myTable.display();
    }
}
