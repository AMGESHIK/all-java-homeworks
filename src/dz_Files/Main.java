package dz_Files;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        HashMap<String, String> dict = null;
        try {
            br = new BufferedReader(new FileReader("dzDictionary"));
            String line;
            dict = new HashMap<>();
            int count = 0;
            String temp = null;
            while ((line = br.readLine()) != null) {
                if (count % 2 == 0) {
                    dict.put(line, null);
                    temp = line;
                } else {
                    dict.put(temp, line);
                }
                count += 1;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error: " + e);

            }
        }

        try {
            br = new BufferedReader(new FileReader("dzTextForTranslation"));
            String line;

            while ((line = br.readLine()) != null) {
                String words[] = line.split("\\s");
                for (String subStr : words) {
                    if ((int) subStr.charAt(subStr.length() - 1) >= 33 && (int) subStr.charAt(subStr.length() - 1) <= 64) {
                        System.out.print(dict.get(subStr.substring(0, subStr.length() - 1).toLowerCase(Locale.ROOT)) + subStr.charAt(subStr.length() - 1));
                    } else {
                        System.out.print(dict.get(subStr.toLowerCase(Locale.ROOT))+ " ");
                    }
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error: " + e);

            }
        }
    }
}
