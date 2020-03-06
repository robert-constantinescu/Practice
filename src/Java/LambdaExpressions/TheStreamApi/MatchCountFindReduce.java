package Java.LambdaExpressions.TheStreamApi;

import Java.LambdaExpressions.CreateNewApi.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MatchCountFindReduce {

    public static void main(String[] args) {


        List<Person> people = new ArrayList<>();
        people.add(new Person());

    /*  Match, find, count, reduce

    three types of matchers: anyMatch(), allMatch() and noneMatch()
     */

        // returns true if at least one element matches the predicate
        boolean b = people.stream().anyMatch(p -> p.getAge() > 20);

        // return true if all the elements match the predicate
        boolean b1 = people.stream().allMatch(p -> p.getAge() > 20);

        // return true if no element match the predicate
        boolean b2 = people.stream().noneMatch(p -> p.getAge() > 20);

        // the matchers may not evaluate the predicate for all the elements, therefore they are called SHORT-CIRCUITING terminal operations

        /*
========================================================================================================================
            Find Reductions
                there are 2 types of find reduction: findFist() and findAny()
                the 2 methods might have nothing to return:
                            - if the Stream is empty
                            - if there is no value the matches the predicate
                     So they both return an Optional, that can be empty
         */

        Optional<Person> opt =
                people.stream().filter(person -> person.getAge() >  20)
                // return the object, if any, wrapped in an Optional. This means that the list has an order, if not then any object is returned
                .findFirst();


        Optional<Person> opt1 =
                people.stream()
                        .filter(person -> person.getAge() >  20)
                        //returns any object, if it exists, wrapped in an Optional
                        .findAny();

        /*
========================================================================================================================
        Reduce Reduction
            * There are 3 types of reduce reduction
            * if no identity element is provided, then an Optional is returned
            * Associativity is assumed for the reduction function, but not enforced by the compiler

         */

        int sumOfAges = people.stream()
                /*
                the identity element is 0, here. So the result is an Int
                 */
                .map(p -> p.getAge())
                .reduce(0, (p1 , p2) -> p1 + p2);


        Optional<Integer> maxOfAges = people.stream()
                                .map(p -> p.getAge())
                                .reduce((p1, p2) -> Integer.max(p1, p2));





    }


}
