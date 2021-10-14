package ru.mirea.task3;

public class Human {
    public static void main(String[] args){
        Leg leg1 = new Leg(15.5, 4.1, 10);
        Hand hand1 = new Hand(10.3, 3.6, 7);
        Head head1 = new Head(7.4, 5.7, 5);
        System.out.println("Leg: " + leg1.getLegHeight() + " " + leg1.getLegWidth() + " " + leg1.getLegWeight() +
                "\nHand: " + hand1.getHandHeight() + " " + hand1.getHandWidth() + " " + hand1.getHandWeight() +
                "\nHead: " + head1.getHeadHeight() + " " + head1.getHeadWidth() + " " + head1.getHeadWeight());

    }
}
