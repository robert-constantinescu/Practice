package Java.LambdaExpressions.TheStreamApi;

import Java.LambdaExpressions.CreateNewApi.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;
import java.util.stream.BaseStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public interface StreamDefinition<T> extends BaseStream<T, Stream<T>> {
    CharSequence book = "book name";
    /*  From a technical point of view: a typed interface
            So stream can be defined on any type of objects

        We also have 3 other streams: IntStream, LongStream & DoubleStream (streams build on primitive types)


        From a developer point of view it is a new concept in Java 8
        Since is a new concept we are free to put anything we want in it

        Stream: Definitions
            * A stream does not hold any data
                    - it pulls the data it processes from a source
            * A stream just processes data
            * A stream does not modify the data it processes
                    - because we want to process the data in parallel with no visibility issue
            * The source may be unbounded
                    - Which can mean it's not finite'
                    - but most of the times, it only means that the size of the sources is not known at build time
     */


    public static void main(String[] args) throws IOException {
        // How to build streams

        // the first pattern.. a list of objects
        List<Person> people = new ArrayList<>();
        Stream<Person> stream = people.stream();

        // an empty stream
        Stream.empty(); //  returns a stream that is empty. Very useful for testing purposes

        // a singleton Stream
        Stream.of("one");

        // a stream with several elements
        Stream.of("one", "two", "three");

        //a constant Stream
        Stream.generate(() -> "one");

        //a growing Stream
        Stream.iterate("+", s -> s + "+");

        //a random Stream
        ThreadLocalRandom.current().ints();

        // a stream on the letters of a String
        IntStream streamString = "hello".chars();

        //a stream on a regular expression
        Stream<String> words = Pattern.compile("[^\\p{javaLetter}]").splitAsStream(book);

        // a Stream on the lines of a text file
        Stream<String> lines = Files.lines(Path.of("/path/to/the/file"));

        //the StreamBuilder pattern
            //First build a Stream.Builder
        Stream.Builder<String> builder = Stream.builder();
            //to add data in the builder, by chaining the add() method
            builder.add("one").add("two").add("three");
            // or by calling accept()
            builder.accept("four");
            //call the build() method
        Stream<String> streamBuild = builder.build();
        //Use the Stream
        stream.forEach(System.out::println);
        // a BUILT stream will throw an exception an an add() or accept() call



    }
}
