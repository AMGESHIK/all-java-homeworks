package dz_exceptions2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите уменьшаемое и вычитаемое:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a - b;
        try {
            if (c < 0) throw new NegativeResultException("исключение: разность отрицательна");
        } catch (NegativeResultException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.print("Модуль разности:");
            System.out.println(Math.abs(c));
        }
        sc.close();
    }
}
