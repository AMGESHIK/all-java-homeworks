package dz_bugalteria;

import java.util.Random;

public class bookkeeping {
    static Random rand = new Random();
    static int size = 15;
    static int count = 0;
    static Employee arr[] = new Employee[size];

    public static void prem(Employee arr[]) {
        for (int i = 0; i < size; i++) {
            if (arr[i].experience < 6) count++;
        }
        for (int i = 0; i < size; i++) {
            if (arr[i].experience >= 6) {
                arr[i].numberOfTrainees = rand.nextInt(count);
                count -= arr[i].numberOfTrainees;
            }
            if (arr[i].numberOfTrainees > 3) {
                arr[i].premium += 20;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < size; i++) {
            arr[i] = new Employee("employee" + i, rand.nextInt(10), 0);
        }
        prem(arr);
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i].name + " has " + arr[i].experience +
                    " month of experience and " + arr[i].numberOfTrainees
                    + " Trainees. And increases the premium by " + arr[i].premium + "%");
        }
    }
}
