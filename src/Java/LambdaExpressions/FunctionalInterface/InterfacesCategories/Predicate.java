package Java.LambdaExpressions.FunctionalInterface.InterfacesCategories;




//a predicate takes an object of any type and returns a boolean
//it is used in the filtering step of the map().filter().reduce() algorithm

import Java.LambdaExpressions.CreateNewApi.Person;

public interface Predicate<T> {

    public boolean test(T t);

    Predicate<Person> ageGreaterThan20 = person -> person.getAge() > 20;


    // Takes 2 parameters instead of one
    public interface BiPredicate<T, U> {

        public boolean test(T t, U u);
    }


}
