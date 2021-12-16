package ru.mirea.task20;

import java.text.DateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.text.SimpleDateFormat;

public class Main
{
    public static void Task()
    {
        // календарь на 25.01.2015
        Calendar c = new GregorianCalendar(2021, 10, 2);
        c.set(Calendar.HOUR, 23);
        c.set(Calendar.MINUTE, 56);

        DateFormat df = new SimpleDateFormat("yyyy.MM.dd hh:mm a");
        System.out.println("Работа выдана: " + df.format(c.getTime()));

        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd hh:mm a");

        System.out.println("Работа сдана: " + formatForDateNow.format(dateNow));
    }
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar(2021, Calendar.DECEMBER, 15);
        calendar.set(Calendar.HOUR, 18);
        calendar.set(Calendar.MINUTE, 42);

        DateFormat df = new SimpleDateFormat("yyyy MMMM dd  k:m");
        System.out.println(df.format(calendar.getTime()));

        Task();


    }
}