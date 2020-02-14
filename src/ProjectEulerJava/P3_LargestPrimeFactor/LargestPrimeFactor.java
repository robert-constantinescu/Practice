package ProjectEulerJava.P3_LargestPrimeFactor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestPrimeFactor {

    public static void main(String[] args) {
        LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();

        long constant = 600851475143L;
        long i = 0L;
        List<Long> primeFactors = new ArrayList<>();
        while(true) {
            if (constant == 1)
                break;
            i++;
            if (largestPrimeFactor.isPrimeNumber(i)) {
                if(constant % i ==0) {
                    primeFactors.add(i);
                    constant = constant / i;
                }
            }
        }
        System.out.println(primeFactors);
        System.out.println(Collections.max(primeFactors));
    }

    public boolean isPrimeNumber(long n) {
        List<Long> divisors = new ArrayList<>();
        for (long d = 1; d < n; d++) {
            if (n % d == 0) {
                divisors.add(d);
                if (divisors.size() > 2) {
                    return false;
                }
            }
        }
        return true;
    }

}
