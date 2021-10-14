package ru.mirea.task5;

public class Pinscher_and_Schnauzer extends Dog {
    private int height;
    private int weight;
    private String breed;

    public Pinscher_and_Schnauzer(String name){
        super(name);
        this.breed = "Doberman";
        this.height = 70;
        this.weight = 42;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void display(){
        System.out.printf("Pinscher_and_Schnauzer{name=" + super.getName() +
                ", breed=" + breed + ", height=" + height + ", weight=" + weight +
                "}\n");
    }
}
