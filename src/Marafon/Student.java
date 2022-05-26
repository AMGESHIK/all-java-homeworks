package Marafon;

public class Student {
    private int number_of_student;
    private float result_of_student;

    public Student(int number_of_student, float result_of_student) {
        this.number_of_student = number_of_student;
        this.result_of_student = result_of_student;
    }

    public int getNumber_of_student() {
        return number_of_student;
    }

    public float getResult_of_student() {
        return result_of_student;
    }

    public void setNumber_of_student(int number_of_student) {
        this.number_of_student = number_of_student;
    }

    public void setResult_of_student(float result_of_student) {
        this.result_of_student = result_of_student;
    }
}
