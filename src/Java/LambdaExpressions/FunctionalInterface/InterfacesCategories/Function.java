package Java.LambdaExpressions.FunctionalInterface.InterfacesCategories;



//Takes an objects and returns another object

import Java.LambdaExpressions.CreateNewApi.Person;

public interface Function<T, R> {

    // Takes an object of type T and returns an R
    public R apply(T t);

    Function<Person, Integer> ageMapper = person -> person.getAge();
    Function<Person, Integer> ageMapperMethodReference = Person::getAge;


    //takes 2 objects and returns one
    public interface BiFunction<T, V, R> {

        public R apply(T t, V v);

    }


    //takes on object of a given type, and returns the same type, that might be the same object or another one
    public interface UnaryOperator<T> extends Function<T, T> {

    }

    //basically a binary operator takes 2 objects of the same type and return one object of the same type as the parameters
    public interface BinaryOperator<T> extends BiFunction<T, T, T> {

    }






}




