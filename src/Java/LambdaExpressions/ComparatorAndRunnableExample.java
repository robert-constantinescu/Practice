package Java.LambdaExpressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Executors;

public class ComparatorAndRunnableExample {


    //classic basic comparator in an anonymous class
    static Comparator<String> comparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return Integer.compare(o1.length(), o2.length());
        }
    };

    //the below lamba comparator is the equivalent of the above anonymous class
    static Comparator<String> lambdaComparator = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());

    // in the case we have a return value, we can keep the {}
    // but it is not possible to specify the return type of a lambda expression
    static Comparator<String> lambdaComparatorWithReturn = (String s1, String s2) -> {
                                        System.out.println("Here we compare the strings and return the resulted value");
                                        return Integer.compare(s1.length(), s2.length());
                                };

    // You can also omit the @parameters type
    static Comparator<String> lambdaComparatorWithoutParameterType= (s1, s2) -> {
        System.out.println("Here we compare the strings and return the resulted value");
        return Integer.compare(s1.length(), s2.length());
    };






    //classic runnable in an anonymous class
    static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            int i = 0;
            while(i++ < 10) {
                System.out.println("it works!");
            }
        }
    };

    //the below lamba runnable is the equivalent of the above anonymous class
    static Runnable lambdaRunnable = () -> {
        int i = 0;
        while(i++ < 10) {
            System.out.println("it works with lambda");
        }

    };



    public static void main(String[] args) {
        String[] arrayOfStrings = new String[]{"first ","second", "third"};

        //in both of the below methods, we basically pass code as a parameter
        Arrays.sort(arrayOfStrings, comparator);
        Executors.newSingleThreadExecutor().execute(runnable);

    }



}
