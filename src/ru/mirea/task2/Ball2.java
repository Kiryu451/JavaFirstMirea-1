package ru.mirea.task2;

public class Ball2
{
    private String color;
    private int dim;
    public Ball2(String c, int d)
    {
        color = c;
        dim = d;
    }
    public Ball2(String c)
    {
        color = c;
        dim = 20;
    }
    public Ball2()
    {
        color = "Black";
        dim = 20;
    }
    public void setColor(String c)
    {
        color = c;
    }
    public void setDim(int d)
    {
        dim = d;
    }
    public void OutSC()
    {
        System.out.printf("Ball color is %s and diameter is %d\n", color, dim);
    }
}
