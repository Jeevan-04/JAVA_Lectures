package _23AUG;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;

public class Animal {
    public static void main(String[] args) {
        ArrayList<String> Animal1 = new ArrayList<String>();
        Animal1.add("Cat");
        Animal1.add("Dog");
        Animal1.add("Cow");
        Animal1.add("Lion");
        System.out.println(Animal1);

        Animal1.add(0,"Tiger");
        Animal1.add(3,"Zebra");
        System.out.println(Animal1);



        ArrayList<String> Animal2 = new ArrayList<String>();
        Animal2.add("Kangaroo");
        Animal2.add("Donkey");
        Animal2.add("Cow");

        Animal1.addAll(Animal2);
        System.out.println(Animal1);

        System.out.println(Animal1.contains("Dog"));

        System.out.println(Animal1.contains("Rat"));

        System.out.println(Animal1.isEmpty());

        System.out.println(Animal1.size());

        while (Animal1.contains("Cow")) {
            Animal1.remove(Animal1.indexOf("Cow"));
        }

        System.out.println(Animal1);

        Animal1.remove(2);
        System.out.println(Animal1);

        Animal1.add(2,"Ant");
        System.out.println(Animal1);

        Animal1.set(2, "Antelope");

        System.out.println("Using for loop:");
        for (int i = 0; i < Animal1.size(); i++) {
            System.out.println(Animal1.get(i));
        }

        System.out.println("\nUsing enhanced for loop:");
        for (String animal : Animal1) {
            System.out.println(animal);
        }

        System.out.println("\nUsing iterator:");
        Iterator<String> iterator = Animal1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing list iterator:");
        ListIterator<String> listIterator = Animal1.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
