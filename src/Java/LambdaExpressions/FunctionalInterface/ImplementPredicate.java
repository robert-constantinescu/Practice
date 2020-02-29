package Java.LambdaExpressions.FunctionalInterface;

public class ImplementPredicate {


    //instance of the anonymous class
    Predicate<String> p = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length() < 20;
        }
    };



    public static void main(String[] args) {

        //with lambda
        Predicate<String> p1 = s -> s.length() < 20;
        Predicate<String> p2 = s -> s.length() < 5;
        boolean b = p1.test("Hello");

        Predicate<String> p3 = p1.and(p2);
        Predicate<String> p4 = p1.or(p2);

        Predicate<String> p5 = Predicate.isEqualTo("Yes");

    }

}
