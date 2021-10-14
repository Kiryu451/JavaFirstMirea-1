package ru.mirea.task3;

public class CircleBook {
    public static void main(String[] args){
        Circle c1 = new Circle(5, "Blue");
        System.out.println("Radius: " + c1.getRadius() + " Color: " + c1.getColor());
      
        Book b1 = new Book();
        b1.OutNP();
    }
}
