package dz_Threads;
/*
import java.util.Scanner;

public class Main {
    public static CalcThread[] threads;
    public static int sums[];
    public static int pieceOfThreads;
    public static int arr[];
    public static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива:");
        int n = sc.nextInt();
        System.out.println("Введите массив:");
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + Integer.toString(i) + "]=");
            arr[i] = sc.nextInt();
        }
        System.out.print("Введите число потоков:");
        int k = sc.nextInt();
        threads = new CalcThread[k];
        sums = new int[k];
        pieceOfThreads = (int) Math.ceil((double) n / k);
        for (int i = 0; i < k; i++) {
            threads[i] = new CalcThread();
        }
        count = 0;
        for (int i = 0; i < k; i++) {
            threads[i].start();
        }
        int totalAmount = 0;
        for (int i = 0; i < k; i++) {
            totalAmount += sums[i];
        }
        System.out.println("Сумма массива = " + totalAmount);

    }
}
*/
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int array[];

    public static int sums[];

    public static int sum;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива:");
        int n = sc.nextInt();
        System.out.println("Введите массив:");
        array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + Integer.toString(i) + "]=");
            array[i] = sc.nextInt();
        }
        System.out.print("Введите число потоков:");
        int k = sc.nextInt();
        sums = new int[k];

        int byThreadSum = 0;
        int numberOfElementsInOneThread = (int)Math.ceil((double)(n) / (double)(k));
        int[] sums = new int[k];
        for (int i = 0; i < sums.length; i++) {
            CalcThread CalcThread= new CalcThread(i * numberOfElementsInOneThread, (i + 1) * numberOfElementsInOneThread -1);
            CalcThread.start();
            try {
                CalcThread.join();
            } catch (InterruptedException e) {
                throw new IllegalArgumentException();
            }
            sums[i] = sum;
            byThreadSum += sums[i];
        }


        System.out.println("Сумма через потоки - " + byThreadSum);
    }
}