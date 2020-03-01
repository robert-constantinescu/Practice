package Java.Generics.GenericsOnMethods;


import Java.Generics.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExamples {

    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person bertCooper= new Person("Bert Cooper", 100);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCooper);

        Comparator<Person> comparator = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());
        Comparator<Person> comparatorWithMethodRefernce = Comparator.comparingInt(Person::getAge);

        final Person youngestCastMember = (Person) minWithoutGenerics(madMen, comparator);
        final Person youngestCastMemberGenerified = minGenerified(madMen, comparator);

        System.out.println(youngestCastMember);
    }


    public static <T> T minGenerified(List<T> values, Comparator<T> comparator) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("List is empty. No minimum!");
        }
        T lowestElement = values.get(0);

        for (int i = 1; i < values.size(); i++) {
            final T element = values.get(i);
            if (comparator.compare(element, lowestElement) < 0)
                lowestElement = element;

        }
        return lowestElement;

    }



    public static Object minWithoutGenerics(List values, Comparator comparator) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("List is empty. No minimum!");
        }

        Object lowestElement = values.get(0);

        for (int i = 1; i < values.size(); i++) {
            final Object element =values.get(i);
            if (comparator.compare(element, lowestElement) < 0)
                lowestElement = element;

        }

        return lowestElement;

    }
}


