package dz_collection1;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //1
        LinkedList<Pet> pets = new LinkedList<>();
        pets.add(new Pet("dog"));
        pets.add(new Pet("cat"));
        pets.add(new Pet("parrot"));
        pets.add(new Pet("hamster"));

        //2
        for (Pet x : pets) {
            System.out.println(x.name);
        }

        //3
        System.out.println("\n" + pets.peekFirst().name);
        System.out.println(pets.peekLast().name);

        //4
        System.out.println("\nУбрали с конца списка следующего питомца:" + pets.removeLast().name);

        //5
        for (Pet x : pets) {
            System.out.println(x.name);
        }

        //6
        System.out.println("\nУбрали с начала списка следующего питомца:" + pets.removeFirst().name);

        //7
        for (Pet x : pets) {
            System.out.println(x.name);
        }

        //8
        System.out.println("\nУбрали головной элемент:" + pets.poll().name + "\n");

        //9
        pets.push(new Pet("turtles"));

        //10
        for (Pet x : pets) {
            System.out.println(x.name);
        }

        //11
        pets.offer(new Pet("rat"));

        //12
        System.out.println();
        for (Pet x : pets) {
            System.out.println(x.name);
        }
        System.out.println();
        //13
        pets.offer(new Pet("horse"));

        //14
        for (Pet x : pets) {
            System.out.println(x.name);
        }

    }
}
