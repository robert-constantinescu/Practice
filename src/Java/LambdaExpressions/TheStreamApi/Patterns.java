package Java.LambdaExpressions.TheStreamApi;

import Java.LambdaExpressions.CreateNewApi.Person;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.ArrayList;
import java.util.List;

public class Patterns {


    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

                               // a first way of writting it
        /* Stream<Person> */       people.stream()
        /* Stream<Integer> */             .map(p -> p.getAge())
        /* Stream<Integer> */             .filter(age -> age > 20)
        /* print the ages  */             .forEach(System.out::println);

        //What if we want to print the people themselves
        people.stream()
                .filter(p -> p.getAge() > 20)  //Stream<Person>
                .forEach(System.out::println);

        /* the map() call can change the type of a stream
           the filter() call does not change the type of a stream
         */

        // Intermediate and Terminal calls
        /**
        people.stream()
                .map(p -> p.getAge())
                .forEach(System.out::println)//does not compile, because the forEach() method does not return anything
                .filter(age -> age > 20)  //Stream<Person>
                .forEach(System.out::println); */

        /*
                peek() is an intermediate operation
                forEach() is a terminal operation

                Terminal vs Intermediate Call
                        - a TERMINAL operation must be called to trigger the processing of a Stream
                        - No TERMINAL operation = no data is ever processed

                        - an INTERMEDIATE call does not trigger anything

               How to recognize a TERMINAL CALL:
                1) Read the Javadoc!
                    there is also a trick ...
                2) a call that returns a Stream is an intermediate Call
                   a call that returns something else(even void) is a terminal call that triggers the processing

         */

        people.stream()
                .map(p -> p.getAge())
                /*this peek method has been created mainly for loggin purposes*/
                .peek(System.out::println)
                .filter(age -> age > 20)  //Stream<Person>
                .forEach(System.out::println);



        //Methods skip() and limit()
        //people = [1, 2, 3, 4, 5, 6, 7]
        people.stream()
        /*skip the first 2 elements of a Stream (1, 2) */
               .skip(2)
        /*this will keep the next 3 elements of the Stream (3, 4, 5)  */
               .limit(3) // basically we apply the stream only for the (3, 4, 5) elements
               .filter(person -> person.getAge() > 20)
               .forEach(System.out::println);




    }
}
