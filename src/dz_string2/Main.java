//№222

package dz_string2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку:");
        String sentence = sc.nextLine();
        String sentence_arr[] = sentence.split(" ");
        System.out.println("Эти слова палиндромы:");
        for (String word : sentence_arr) {
            boolean b = true;
            for (int i = 0; i < word.length() / 2; i++) {
                if (word.toLowerCase().charAt(i) != word.toLowerCase().charAt(word.length() - 1 - i)) b = false;
            }
            if (b) System.out.println(word);

        }
    }
}
