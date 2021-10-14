package ru.mirea.task2;

public class Dog2
{
    private String name;
    private int age;

    public Dog2(String n, int a)
    {
        name = n;
        age = a;
    }
    public Dog2(String n)
    {
        name = n;
        age = 0;
    }
    public Dog2()
    {
        name = "Pup";
        age = 0;
    }
    public void SetAge(int age)
    {
        this.age = age;
    }
    public void SetName(String name)
    {
        this.name = name;
    }
    public String getName ()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String toString()
    {
        return this.name+", age "+this.age;
    }
    public void intoHumanAge()
    {
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}
