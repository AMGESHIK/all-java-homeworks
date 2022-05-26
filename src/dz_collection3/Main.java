package dz_collection3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> numbersHashSet = new HashSet<>();
        SortedSet<Integer> numberSortedSet = new TreeSet<>();
        Set<Integer> numberLinkedHashSet = new LinkedHashSet<>();

        for (int i = 0; i < 50; i++) {
            numbersHashSet.add(i);
            numberSortedSet.add(i);
            numberLinkedHashSet.add(i);
        }

        System.out.println("numbersHashSet:");
        for (Integer x : numbersHashSet) {
            System.out.print(x + ",");
        }
        System.out.println();

        System.out.println("numberSortedSet:");
        for (Integer x : numberSortedSet) {
            System.out.print(x + ",");
        }
        System.out.println();

        System.out.println("numberLinkedHashSet:");
        for (Integer x : numberLinkedHashSet) {
            System.out.print(x + ",");
        }
        System.out.println();

        HashSet<Integer> numbersHashSet2 = new HashSet<>(Arrays.asList(1, 33, 54, 25, 31, 67));
        if (numberSortedSet.containsAll(numbersHashSet2)) {
            System.out.println("HashSet содержит Treeset");
        } else {
            System.out.println("HashSet не содержит Treeset");
        }

        numberSortedSet.removeAll(numbersHashSet2);

        System.out.println("numberSortedSet:");
        for (Integer x : numberSortedSet) {
            System.out.print(x + ",");
        }
        System.out.println();
    }
}
