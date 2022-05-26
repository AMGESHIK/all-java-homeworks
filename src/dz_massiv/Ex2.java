//Дан массив размерности n. Найти самую длинную последовательность подряд идущих элементов массива,
// равных единице, подсчитать их количество, указать индекс первой единицы.

package dz_massiv;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = sc.nextInt();
        }
        System.out.println("array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int count = 0, index = -1, control_count = 0, control_index = -1;
        boolean a = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                if (a) {
                    index = i;
                    a = false;
                }


            } else {
                count = 0;
                index = -1;
                a = true;
            }
            if (count > control_count) {
                control_count = count;
                control_index = index;
            }
        }
        System.out.println("\n count=" + control_count + "\n index=" + control_index);

    }
}
