package ru.mirea.task10;

public class Five {
    public static int recursion(int N) {
        if (N < 10)
            return N;
        else
            return N % 10 + recursion(N / 10);
    }

    public static void main(String[] args) {
        System.out.println(recursion(4657));
    }
}
