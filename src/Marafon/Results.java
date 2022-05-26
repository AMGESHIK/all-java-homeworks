package Marafon;

import java.util.Random;

public class Results {
    Random rand = new Random();
    static int size = 15;
    static Student[] students = new Student[size];
    static private float leftLimit = 3F;
    static private float rightLimit = 10F;

    public Results() {
        for (int i = 0; i < size; i++)
            this.students[i] = new Student(i, leftLimit + rand.nextFloat() * (rightLimit - leftLimit));
    }

    public Student[] sort() {
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (students[j].getResult_of_student() > students[j + 1].getResult_of_student()) {
                    Student tmp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tmp;
                }
            }
        }
        return students;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println("\nNumber of student: " + sort()[i].getNumber_of_student() +
                    "\nHis time = " + sort()[i].getResult_of_student());
        }
    }

    public Student winner() {
        System.out.println("Winner is number " + sort()[0].getNumber_of_student());
        return sort()[0];
    }

    public void threeWinners() {
        System.out.println("1st winner is number" + sort()[0].getNumber_of_student() +
                "\n2nd winner is number " + sort()[1].getNumber_of_student() +
                "\n3rd winner is number " + sort()[2].getNumber_of_student());
    }

    public float averageTime() {
        float average = 0f;
        for (int i = 0; i < size; i++) {
            average += students[i].getResult_of_student();
        }
        average /= size;
        System.out.println("Average time of " + size + " students is " + average);
        return average;
    }

}
