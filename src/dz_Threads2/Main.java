package dz_Threads2;

import java.util.Scanner;

public class Main {
    public static int n;
    public static int array[];

    public static int calcSum(){
        int sum = 0;
        for (int i = 0; i < Main.array.length; i++)
            sum += Main.array[i];
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива:");
        n = in.nextInt();
        array = new int[n];
        System.out.println("Введите массив:");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        myThread firstThread = new myThread();
        myThread secondThread = new myThread();
        firstThread.run();
        secondThread.run();
    }

}
