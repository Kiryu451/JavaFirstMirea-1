package ru.mirea.task2;

public class Main2
{
    public static void main(String[] args)
    {
        Dog2 d1 = new Dog2("Mike", 2);
        Dog2 d2 = new Dog2("Helen", 7);
        Dog2 d3 = new Dog2("Bob");
        d3.SetAge(1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

        Ball2 b1 = new Ball2("White", 43);
        Ball2 b2 = new Ball2("Orange");
        Ball2 b3 = new Ball2();
        b3.setColor("Purple");
        b3.setDim(15);
        b1.OutSC();
        b2.OutSC();
        b3.OutSC();

        Book2 bo1 = new Book2("White noise", 43);
        Book2 bo2 = new Book2("Yorm");
        Book2 bo3 = new Book2();
        bo3.setName("World of seas");
        bo3.setPages(125);
        bo1.OutNP();
        bo2.OutNP();
        bo3.OutNP();
    }
}
