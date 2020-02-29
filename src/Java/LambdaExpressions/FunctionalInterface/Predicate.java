package Java.LambdaExpressions.FunctionalInterface;



// a lambda expression is an instance of a functional interface
@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);
    // at this point, a *functional interface* is an interface with only one method. See more details in FunctionalInterfaceDefinitions.txt


    public default Predicate<T> and(Predicate<T> other) {
        return t -> test(t) && other.test(t);
    };

    public default Predicate<T> or (Predicate<T> other) {
        return t -> test(t) || other.test(t);
    }

    public static <U> Predicate<U> isEqualTo(U u) {
        return t -> t.equals(u);
    }

}