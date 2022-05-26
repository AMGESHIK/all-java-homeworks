package dz_interface2;

import java.util.Scanner;


import dz_interface2.Paper;
import dz_interface2.notebook;
import dz_interface2.notebookForDrawing;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paper dfa = new notebookForDrawing();
        System.out.print("Enter your name: ");
        dfa.sign(sc.nextLine());
        System.out.println("What do you want to draw?");
        dfa.draw(sc.nextLine());
    }
}


