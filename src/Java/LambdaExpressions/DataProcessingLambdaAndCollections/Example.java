package Java.LambdaExpressions.DataProcessingLambdaAndCollections;

import Java.LambdaExpressions.CreateNewApi.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();


        // the .forEach takes a Consumer as argument and applies for each element from the colections
        persons.forEach(System.out::println);

        //the .removeIf takes a Predicate as a parameter and removes the element if the condition is true
        persons.removeIf(person -> person.getAge() > 20);

        //on the List interface .replaceAll takes an UnaryOperator( takes on object, and returns the same type)
        //e.g below takes a person and must return a person
        persons.replaceAll(person -> new Person());

        // the sort methods takes a Comparator and sorts elements in the list based on the comparator rule
        persons.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getLastName));


    }
}
