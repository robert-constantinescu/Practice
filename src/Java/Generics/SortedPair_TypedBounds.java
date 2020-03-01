package Java.Generics;


// the *extends Comparable* is saying that each type T, must implement Comparable, in order to be a valid type for this class
/* what *T extends Comparable<T>* is saying:
            We got a generic parameter called T
            and 2 elements with the type of T (first, second)
            and they are going to implement the Comparable intterface
            and they are going to be comparable to themselves

 */
public class SortedPair_TypedBounds<T extends Comparable<T>>

{

    private final T first;
    private final T second;


    public SortedPair_TypedBounds(T left, T right) {
        if (left.compareTo(right) < 0) {
            first = left;
            second = right;
        } else {
            first = right;
            second = left;
        }

    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
