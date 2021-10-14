package ru.mirea.task2;

public class Book2
{
    private String name;
    private int pages;
    public Book2(String c, int d)
    {
        name = c;
        pages = d;
    }
    public Book2(String c)
    {
        name = c;
        pages = 354;
    }
    public Book2()
    {
        name = "Book for people";
        pages = 569;
    }
    public void setName(String c)
    {
        name = c;
    }
    public void setPages(int d)
    {
        pages = d;
    }
    public void OutNP()
    {
        System.out.printf("Book's name is %s and it's size is %d pages\n", name, pages);
    }
}
