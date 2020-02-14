package ProjectEulerJava.P7_the10001stPrimeNumber;

public class the10001stPrimeNumber {

    public static void main(String[] args) {

        int count = 0 , number = 1;
        while(true) {
            number++;
            if (isprime(number)) {
                count++;
                System.out.println(number + " is the " + count + " prime number");
                if (count == 10001) {
                    System.out.println(number);
                    break;
                }
            }
        }
    }

    public static boolean isprime(int n) {
        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
