package Java.LambdaExpressions.FunctionalInterface.InterfacesCategories;


import Java.LambdaExpressions.CreateNewApi.Person;

//A supplier is just the opposite of a consumer
//a supplier provides an object, takes no parameter, but returns an object of type T

public interface Supplier<T> {

    public T get();


    Supplier<Person> personSupplier = () -> new Person();
    Supplier<Person> personSupplierMethodReference = Person::new;
}
