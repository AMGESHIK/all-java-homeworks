package dz_interface;

import dz_interface.Employee;
import dz_interface.Engineer;
import dz_interface.Leader;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee viktor = new Engineer();
        Employee alexandr = new Leader();
        viktor.who("Viktor");
        alexandr.who("Aleksandr");
    }
}

