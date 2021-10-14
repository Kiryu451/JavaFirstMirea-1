package ru.mirea.task5;

public class Small_Terriers extends Dog {
    private int height;
    private int weight;
    private String breed;

    public Small_Terriers(String name){
        super(name);
        this.breed = "Silichem Terrier";
        this.height = 31;
        this.weight = 9;
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
        System.out.printf("Small_Terriers{name=" + super.getName() +
                ", breed=" + breed + ", height=" + height + ", weight=" + weight +
                "}\n");
    }
}
