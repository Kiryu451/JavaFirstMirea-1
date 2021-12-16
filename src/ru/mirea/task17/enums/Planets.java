package ru.mirea.task17.enums;

import java.util.Scanner;

enum Planet {
    MERCURY (3.303e+23, 2.4397e6),
    VENUS (4.869e+24, 6.0518e6),
    EARTH   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7),
    PLUTO   (1.27e+22,  1.137e6);

    private double mass;
    private double radius;

    private Planet(double mass, double radius){
        this.mass = mass;
        this.radius = radius;
    }

    public double mass()   { return mass; }
    public double radius() { return radius; }

    //гравитационная постоянная
    public static double G = 6.67300E-11;

    public double surfaceGravity() {
        return G * mass / (radius * radius);
    }
    public double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }
}

class Planets {
    public static void main (String [] args){
        Planet mcy = Planet.MERCURY;
        Planet vns = Planet.VENUS;
        Planet rth = Planet.EARTH;
        Planet mrs = Planet.MARS;
        Planet jpt = Planet.JUPITER;
        Planet strn = Planet.SATURN;
        Planet urn = Planet.URANUS;
        Planet npt = Planet.NEPTUNE;

        Scanner userw = new Scanner(System.in);
        Scanner userp = new Scanner(System.in);
        System.out.println("Введите свой вес: ");
        double earthWeight = userw.nextInt();
        double mass = earthWeight/rth.surfaceGravity();

        /*for (Planet p : Planet.values())
            System.out.printf("Your weight on %s is %f%n",
                    p, p.surfaceWeight(mass));*/

        System.out.println("Введите название планеты на которой хотите узнать свой вес: ");
        String line = userp.nextLine().toUpperCase();

        switch(line){
            case "MERCURY":
                System.out.println("Ваш вес на " + mcy + " равняется "+ mcy.surfaceWeight(mass));
                break;
            case "VENUS" :
                System.out.println("Ваш вес на " + vns + " равняется "+ vns.surfaceWeight(mass));
                break;
            case "EARTH":
                System.out.println("Ваш вес на " + rth + " равняется "+ rth.surfaceWeight(mass));
                break;
            case "MARS":
                System.out.println("Ваш вес на " + mrs + " равняется "+ mrs.surfaceWeight(mass));
                break;
            case"JUPITER":
                System.out.println("Ваш вес на " + jpt + " равняется "+ jpt.surfaceWeight(mass));
                break;
            case "SATURN":
                System.out.println("Ваш вес на " + strn + " равняется "+ strn.surfaceWeight(mass));
                break;
            case "URANUS":
                System.out.println("Ваш вес на " + urn + " равняется "+ urn.surfaceWeight(mass));
                break;
            case "NEPTUNE":
                System.out.println("Ваш вес на " + npt + " равняется "+ npt.surfaceWeight(mass));
                break;
            default:
                System.out.println("error, not a planet");
        }
    }
}