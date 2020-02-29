package Java.LambdaExpressions;

import java.util.function.Consumer;

public class LambdaWithConsumer {

    //the below are equivalent
    Consumer<String> printer = s -> System.out.println(s);
    Consumer<String> printerWithMethodReference = System.out::println;


}
