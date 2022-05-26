package dz_collections_2_2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase(Locale.ROOT);
        HashMap<Character, Integer> symbols = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (!symbols.containsKey(text.charAt(i)))
                symbols.put(text.charAt(i), 1);
            else {
                temp = symbols.get(text.charAt(i));
                symbols.put(text.charAt(i), temp+1);
            }
        }
        System.out.println(Collections.singletonList(symbols));
    }
}
