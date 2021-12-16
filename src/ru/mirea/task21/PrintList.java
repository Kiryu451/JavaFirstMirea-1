package ru.mirea.task21;

import java.util.ArrayList;
import java.util.List;

public class PrintList<T> {
    private ArrayList<T> list = null;

    public PrintList() {
        list = new ArrayList<T>();
    }

    public void add(T data) {
        list.add(data);
    }
    public void printList(boolean isOdd) {
        int size = list.size();
        if (isOdd) {
            for (int i = 1; i < size; i += 2) {
                System.out.println(list.get(i).toString());
            }
        } else{
            for (int i = 0; i < size; i += 2) {
                System.out.println(list.get(i).toString());
            }
        }
    }
    public static void main(String[] args) {
        PrintList<String> plS = new PrintList<String>();
        for (int i = 0; i < 10; i++){
            switch (i){
                case 0:
                    plS.add("Котельники");
                    break;
                case 1:
                    plS.add("Жулебино");
                    break;
                case 2:
                    plS.add("Лермонтовский проспект");
                    break;
                case 3:
                    plS.add("Выхино");
                    break;
                case 4:
                    plS.add("Рязанский проспект");
                    break;
                case 5:
                    plS.add("Кузьминки");
                    break;
                case 6:
                    plS.add("Текстильщики");
                    break;
                case 7:
                    plS.add("Волгоградский проспект");
                    break;
                case 8:
                    plS.add("Пролетарская");
                    break;
                case 9:
                    plS.add("Таганская");
                    break;
            }
        }
        plS.printList(true);
        PrintList<String> plI = new PrintList<String>();
        for (int i = 0; i < 10; i++){
            switch (i){
                case 0:
                    plI.add("Котельники");
                    break;
                case 1:
                    plI.add("Жулебино");
                    break;
                case 2:
                    plI.add("Лермонтовский проспект");
                    break;
                case 3:
                    plI.add("Выхино");
                    break;
                case 4:
                    plI.add("Рязанский проспект");
                    break;
                case 5:
                    plI.add("Кузьминки");
                    break;
                case 6:
                    plI.add("Текстильщики");
                    break;
                case 7:
                    plI.add("Волгоградский проспект");
                    break;
                case 8:
                    plI.add("Пролетарская");
                    break;
                case 9:
                    plI.add("Таганская");
                    break;
            }
        }
        plI.printList(false);
    }
}