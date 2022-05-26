package dz_collection2;

import dz_collection1.Pet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person(1, 20, "Студент", "Булат", "Ибрагимов", "Айратович", "09-912", null));
        persons.add(new Person(2, 18, "Студент", "Андрей", "Филиппов", "Александрович", "09-111", null));
        persons.add(new Person(3, 44, "Преподаватель", "Виктор", "Борисов", "Федорович", null, "Теор. кибернетика"));
        persons.add(new Person(4, 22, "Студент", "Айрат", "Рахматуллин", "Ильназович", "09-813", null));
        persons.add(new Person(5, 39, "Преподаватель", "Рамиль", "Зуфаров", "Исхакович", null, "технологии программирования"));
        persons.add(new Person(6, 21, "Студент", "Айнур", "Зуфаров", "Ильнурович", "07-911", null));
        persons.add(new Person(7, 25, "Студент", "Алексей", "Песошин", "Викторович", "09-913", null));
        persons.add(new Person(8, 57, "Преподаватель", "Михаил", "Селиверстов", "Артемович", null, "прикладная математика"));

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int res = o1.surname.compareTo(o2.surname);
                if (res != 0) {
                    return res;
                }
                int res2 = o1.name.compareTo(o2.name);
                if (res2 != 0) {
                    return res2;
                }
                return o1.patronymic.compareTo(o2.patronymic);
            }
        });

        int i = 0;
        for (Person x : persons) {
            i++;
            if (x.post == "Студент") {
                System.out.println(Integer.toString(i) + ". " + x.surname + " " + x.name.charAt(0) + "." +
                        x.patronymic.charAt(0) + ". — " + x.post + " (группа: " + x.group + ")");
            } else {
                System.out.println(Integer.toString(i) + ". " + x.surname + " " + x.name.charAt(0) + "." +
                        x.patronymic.charAt(0) + ". — " + x.post + " (кафедра: " + x.department + ")");
            }
        }

        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        };

        Person youngest = Collections.min(persons, ageComparator);
        Person eldest = Collections.max(persons, ageComparator);

        System.out.println(youngest.surname + " " + youngest.name + " " + youngest.patronymic + " самый молодой в коллекции человек");
        System.out.println(eldest.surname + " " + eldest.name + " " + eldest.patronymic + " самый взрослый в коллекции человек");

    }
}
