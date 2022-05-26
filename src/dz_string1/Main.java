//№214

package dz_string1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку:");
        String sentence = sc.nextLine();
        String sentence_arr[] = sentence.split(" ");
        System.out.println("Эти слова начинаются и заканчиваются на одну и ту же букву:");
        for (String word : sentence_arr) {
            if (word.toLowerCase().charAt(0) == word.toLowerCase().charAt(word.length() - 1)) {
                System.out.println(word);
            }
        }

    }
}
