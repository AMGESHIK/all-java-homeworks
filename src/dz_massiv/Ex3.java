package dz_massiv;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = in.nextInt();
        int[][] box_1 = new int[n][n];
        int[][] box_2 = new int[n][n];
        int i, j;
        for (i = 0; i < n; ++i) {
            for (j = 0; j < n; ++j) {
                System.out.print("Enter arr[" + i + "][" + j + "]= ");
                box_1[i][j] = in.nextInt();
            }
        }
        for (i = 0; i < n; ++i) {
            for (j = 0; j < n; ++j)
                System.out.print(box_1[i][j] + " ");
            System.out.println("");

        }
        System.out.println("");
        if (MagicBox(box_1, n)) {
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    box_2[i][j] = box_1[n - j - 1][i];
                }
            }
            for (i = 0; i < n; ++i) {
                for (j = 0; j < n; ++j)
                    System.out.print(box_2[i][j] + " ");
                System.out.println("");
            }
        } else {
            System.out.println("This array isn't magic box");
        }
    }

    public static boolean MagicBox(int arr[][], int n) {
        int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum11 = 0, sum12 = 0, i, j;
        boolean bool1 = true;
        for (i = 0; i < n; ++i) {
            sum1 = sum1 + arr[0][i];
            sum2 = sum2 + arr[i][0];
            sum3 = sum3 + arr[i][i];
            sum4 = sum4 + arr[i][n - 1 - i];
        }
        if (sum1 == sum2 && sum2 == sum3 && sum3 == sum4) {
            for (i = 0; i < n; ++i) {
                for (j = 0; j < n; ++j) {
                    sum11 = sum11 + arr[i][j];
                    sum12 = sum12 + arr[j][i];
                }
                if (sum1 != sum11 && sum2 != sum12) {
                    bool1 = false;
                    return bool1;
                }
                sum11 = 0;
                sum12 = 0;
            }
        } else {
            bool1 = false;
            return bool1;
        }
        return bool1;
    }
}
