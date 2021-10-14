package ru.mirea.task1;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        int cnt =0;
        int sum=0;
        while(cnt<10){

            System.out.println(sum +=arr[cnt]);
            cnt++;
        }
        cnt=0;
        sum=0;
        do{
            System.out.println(sum +=arr[cnt]);
            cnt++;
        }while(cnt<10);
        for(int i =0;i<2;i++){
            System.out.println(sc.next());
        }
        cnt=1;
        while(cnt<11){
            System.out.println(1.0/cnt);
            cnt++;
        }
        int arr2[]=new int[10];
        for (int i=0;i<arr2.length;i++){
            arr2[i]= (int) (Math.random()*100);
        }
        for (int i=0;i<arr2.length;i++) {
            System.out.print(arr2[i]+" ");
        }
        bubbleSort(arr2);
        System.out.print("\n");
        for (int i=0;i<arr2.length;i++) {
            System.out.print(arr2[i]+" ");
        }

        System.out.println("\n"+getFactorial(5));
    }
}
