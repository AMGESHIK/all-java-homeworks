package dz_exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            try {
                System.out.print("Введите целое число:");
                MyClass vvod = new MyClass(sc.nextInt());
            } catch (SmallNumberException ex) {
                System.out.println(ex.getMessage());
            } catch (BigNumberException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
}
