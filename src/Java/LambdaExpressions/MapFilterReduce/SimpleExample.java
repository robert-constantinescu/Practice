package Java.LambdaExpressions.MapFilterReduce;

import Java.LambdaExpressions.CreateNewApi.Person;
import Java.LambdaExpressions.FunctionalInterface.InterfacesCategories.Function;

import javax.print.attribute.standard.PresentationDirection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SimpleExample {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        int sum = 0;
        int count = 0;
        for (Person p : people) {
            if (p.getAge() > 20) {
                sum += p.getAge();
                count++;
            }
        }
        double average = 0d;
        if(count > 0) {
            average= sum / count;
        }

        people.add(new Person("First", 25));


        /* ================================================================
                MAP - FILTER - REDUCE                                       */
        /* 1. the mapping step, takes a  List<Person>  returns  List<Integer>
           2. the filtering step,takes a List<Type>    returns  List<Type>.
                It changes the number(the size) of elements i have in my List, by filtering out the elements that does not meet the Predicate
           3. the REDUCTION step, needs to be Associative(search on google about associativity)

         */
        Optional<Integer> ages = people.stream().map(Person::getAge).filter(age -> age > 20).reduce(Integer::sum);
        // an Optional is a wrapper type that may be empty(eg: != Integer, Float, Double, Boolean etc). Have no identity

    }
}
