package ProjectEulerJava.P2_EvenFibonacciNumbers;

import java.util.ArrayList;
import java.util.List;

public class EvenFibonacciNumbers {

    public static void main(String[] args) {

        List<Integer> fib = getFibonacciUntil(4000000);
        int sum = 0;

        for(int i: fib) {
            if (i % 2 == 0)
                sum += i;
        }
        System.out.println(sum);

    }

    public static List<Integer> getFibonacciUntil(int lastFibonacci) {
        List<Integer> fibonacciSeries = new ArrayList<>();
        int x = 0;
        int y = 1;
        fibonacciSeries.add(x);
        fibonacciSeries.add(y);
        while(true) {
            int nextFib = x + y;
            if (nextFib > lastFibonacci) {
                fibonacciSeries.add(nextFib);
                break;
            }
            fibonacciSeries.add(nextFib);
            x = y;
            y = nextFib;
        }
        return fibonacciSeries;
    }

}
