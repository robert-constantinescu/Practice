package ProjectEulerJava.P1_MultiplesOf3And5;

public class MultiplesOf3And5 {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 1000; i++) {
            if (divisibleWith(3, i) != -1) {
                sum += i;
            } else if(divisibleWith(5, i) != -1) {
                sum += i;
            }
        }

        System.out.println(sum);

    }


    public static int divisibleWith(int divisor, int number) {
        if (number % divisor == 0) {
            return 1;
        } else return -1;
    }

}
