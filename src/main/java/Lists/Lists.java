package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {


        java.util.List<Person> persons_arrayList = new ArrayList<>();
        java.util.List<Person> persons_linkedList = new LinkedList<>();


        Person p1 = new Person("Krzysiek", "Kocurek");
        Person p2 = new Person("Jan", "Nowak");
        Person p3 = new Person("Piotr", "Musk");
        Person p4 = new Person("Maciej", "Maciejowski");

        persons_arrayList.add(p1);
        persons_arrayList.add(p2);
        persons_arrayList.add(p3);
        persons_arrayList.add(p4);

//        System.out.println(persons_arrayList.indexOf(p1));

//        persons_arrayList.remove(2);
        for (Person person : persons_arrayList) {
            System.out.println(person.getFirstname() + " " + person.getSurname());
        }

        System.out.println("_______________________");

        Collections.sort(persons_arrayList, new PersonSurnameComparator());


/*
        for (Person person : persons_arrayList) {
            System.out.println(person.getFirstname() + " " + person.getSurname());

        }*/


        //System.out.println(persons_arrayList.size());

    }
}
