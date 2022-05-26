package dz_massiv;

import java.util.Random;
import java.util.Scanner;

//Дан целочисленный вектор. Циклически переставить компоненты вектора,
// являющиеся простыми числами на нули, со сдвигом вправо.

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        Random rand = new Random();
        System.out.println("array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        boolean a = true;
        int temp_i = 0, temp_1 = 0, temp_2;

        for (int i = 0; i < n; i++) {
            int count = 2;
            while (arr[i] % count != 0) {
                count++;
            }
            if (count == arr[i] && a) {
                temp_1 = arr[i];
                temp_i = i;
                a = false;
            } else if (count == arr[i]) {
                temp_2 = arr[i];
                arr[i] = temp_1;
                temp_1 = temp_2;
            }
        }
        arr[temp_i] = temp_1;

        System.out.println("\n shifted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

