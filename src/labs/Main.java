package labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Comparator<Person> staticComparator = new Person.staticComparator(false);
        Comparator<Person> anonymousComparator = Person.getNewComparator(true);

        Person test1 = new Person("John Doe", 42);
        Person test2 = new Employee("Jane Duh", 18, "IT dept");
        Person test3 = new Manager("Amie Sux", 47, "suckers dept", "always scream \"help!!\"");
        Person test4 = new Manager("X YZ", 24, "department", "homeless");


        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(test1);
        arrayList.add(test2);
        arrayList.add(test3);
        arrayList.add(test4);


        arrayList.sort(staticComparator);
        System.out.println("with static comparator (natural order)");
        for (Person p: arrayList){
            System.out.println(p.getName());
        }
        System.out.println();

        System.out.println("with anonymousComparator (reversed order)");

        TreeSet<Person> treeSet = new TreeSet<>(anonymousComparator);
        treeSet.add(test1);
        treeSet.add(test2);
        treeSet.add(test3);
        treeSet.add(test4);
        for (Person p: treeSet){
            System.out.println(p.getName());
        }
        System.out.println();


    }
}
