package Java.LambdaExpressions;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class LambdaMethodReferences {


    //classic lambda expressions
    Function<Person, Integer> f = person -> person.getAge();

    //lambda with method reference, is equivalent with the above
    Function<Person, Integer> methodReference = Person::getAge;


    //all of the below are equivalent
    BinaryOperator<Integer> firstExample = (i1, i2) -> i1 + i2;
    BinaryOperator<Integer> secondExample = (i1, i2) -> Integer.sum(i1, i2);
    //with method reference
    BinaryOperator<Integer> thirdExample = Integer::sum;



    class Person{

        private int age;

        int getAge() {
            return this.age;
        }

    }
}
