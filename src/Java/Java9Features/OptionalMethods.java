package Java.Java9Features;


import java.util.Optional;
import java.util.Set;

public class OptionalMethods {

    /*
        Optional API:
        Refresher:
            Optional reprsents either a single value
                    Optional<String> s = Optional.of("Hi");
            or it represents no value
                    Optiona<Integer> i = Optional.empty();

            Optional is a better way for a method to say that it may or may not return a value(instead of using null)

        Added methods:
            void ifPresentOrElse(Consumer<T> action, Runnable emptyAction);

            Optional<T> or(Supplier<Optional<T>> supplier);

            Stream<T> stream()   - an empty optional becomes an empty stream, and a full optional becomes a stream with 1 element
                    Stream<Optional<Integer>> optionals = Stream.of(Optional.of(1), Optional.empty(), Optional.of(2));
                    Integer> ints = optionals.flatMap(Optional::stream);  (ints will contain only 1,2)

            Set<String> authors = Book.getBooks()
                                         .map(book -> book.authors.stream().findFirst())
                                         .flatMap(optAuthor -> optAuthor.stream())
                                         .collect(Collectors.toSet());
                    - findFirst() returns an Optional, because : - if there is no first author, it will return an Optional.empty();
                                                                 - if there is a first element, it will return a full Optional containing the firs author(full Optional = optional with 1 element)
                    - flatMap() will take care to return all of the optional stream(made by this optAuthor.stream() ) into a single stream of string
     */

    public static void main(String[] args) {

// ========================= void ifPresentOrElse(Consumer<T> action, Runnable emptyAction);
        Optional<Book> full = Optional.of(Book.getBook());

        // Before ifPresentOrElse
        full.ifPresent(System.out::println);

        if (full.isPresent()) {
            System.out.println(full.get());
        }
        else {
            System.out.println("Nothing here");
        }


        full.ifPresentOrElse(System.out::println, () -> System.out.println("Nothing here !"));

// ========================= Optional<T> or(Supplier<Optional<T>> supplier);

        Optional<Book> localFallBack = Optional.of(Book.getBook());

        //Before Optional.or
        Book bestBookBefore = getBestOffer().orElse(getExternalOffer().orElse(localFallBack.get())); //.get() is BAD!

        //After Optional.or
        Optional<Book> bestBook = getBestOffer()
                                    .or(() -> getExternalOffer())
                                    .or(() -> localFallBack);

    }

    static Optional<Book> getBestOffer() {
        return Optional.empty();
    }

    static Optional<Book> getExternalOffer() {
        return Optional.of(new Book("External Book", Set.of(), 11.99));
    }




}
