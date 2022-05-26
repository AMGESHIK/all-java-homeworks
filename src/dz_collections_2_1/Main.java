package dz_collections_2_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int size = 100000;
        ArrayList<Integer> massiv = new ArrayList<Integer>(size);

        for (int i = 0; i < size; i++) {
            massiv.add(new Random().nextInt(50));
        }

        HashMap<Integer, Integer> raspredelenie = new HashMap<>();
        for (int i = 0; i < 50; i++)
            raspredelenie.put(i, Collections.frequency(massiv, i));

        System.out.println(Collections.singletonList(raspredelenie));


    }
}
