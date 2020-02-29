package Java.LambdaExpressions.CreateNewApi;

import java.util.Comparator;
import java.util.function.Function;

public class MainComparator {

    public static void main(String[] args) {
        Comparator<Person> comparatorAge = (p1, p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> comparatorFirstName = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
        Comparator<Person> comparatorLastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());

        //the below Function, takes a Person and returns either a Integer object or a String object
        Function<Person, Integer> f1 = p -> p.getAge();
        Function<Person, String> f2 = p -> p.getFirstName();
        Function<Person, String> f3 = p -> p.getLastName();


        // the comparing() is a static method from the Comparator interface,
        // takes a function as a parameter, and it returns a comparator of Persong based on the function
        // here it returns a Person comparator based on function f1, which is a Comparator of persons based on the age of the Persons
        Comparator<Person> comparatorPersonAge = Comparator.comparing(f1);
        Comparator<Person> comparatorPersonLambdaAge = Comparator.comparing(p -> p.getAge());
        Comparator<Person> comparatorPersonMethodReferenceAge = Comparator.comparing(Person::getAge);


        Comparator<Person> comparatorPersonLastName = Comparator.comparing(Person::getLastName);


        //the thenComparing() basically is comparing the objects based on some other argument, if the first comparison [ comparatorPersonMethodReferenceAge() ] result with equality
        Comparator<Person> comparatorThenApply = comparatorPersonMethodReferenceAge.thenComparing(comparatorLastName).thenComparing(comparatorFirstName);








    }
}
