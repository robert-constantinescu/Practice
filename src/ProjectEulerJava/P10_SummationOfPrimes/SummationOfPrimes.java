package ProjectEulerJava.P10_SummationOfPrimes;

import java.util.Arrays;

/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */

public class SummationOfPrimes {


    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        int max = 200000000;
        boolean[] primes = returnPrimeNumbersListUntil(max);
        long sum = 0;

        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                sum += i;
            }
        }
        System.out.println(sum);
        long stop = System.currentTimeMillis();
        System.out.println(stop-start);

    }

    public static boolean[] returnPrimeNumbersListUntil(int maxNumber) {
        boolean[] numbers = new boolean[maxNumber];
        Arrays.fill(numbers, true);
        int n = 1;
        while(true) {
            n++;
            for (int i = n * 2; i < maxNumber; i += n) {
                    numbers[i] = false;
            }
            if (n > maxNumber /2)
                break;
        }

        return numbers;
    }
}
