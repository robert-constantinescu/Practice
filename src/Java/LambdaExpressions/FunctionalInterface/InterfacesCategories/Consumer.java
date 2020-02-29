package Java.LambdaExpressions.FunctionalInterface.InterfacesCategories;


//A consumer consumes an object, and does not return anything
public interface Consumer<T> {

    void accept(T t);

    //example
    Consumer<String> printer = s -> System.out.println(s);
    Consumer<String> printerMethodReference = System.out::println;


}

//a biconsumer takes 2 objects instead of one
interface BiConsumer<T, V> {

    void accept(T t, V v);
}
