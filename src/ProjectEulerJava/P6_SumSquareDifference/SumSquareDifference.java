package ProjectEulerJava.P6_SumSquareDifference;


public class SumSquareDifference {

    public static void main(String[] args) {
        long x = (long)sumOfSquares(100D);
        long y = (long)squareOfSum(100L);
        System.out.println(x);
        System.out.println(y);
        System.out.println(y-x);
    }

    public static double sumOfSquares(double n) {
        double sumOfSquares = 0D;
        for (double i = 1; i <= n; i++) {
            sumOfSquares += Math.pow(i, 2);
        }
        return sumOfSquares;
    }

    public static double squareOfSum(double n) {
        double sum = 0L;
        for (double i = 1; i <= n; i++) {
            sum += i;
        }
        return Math.pow(sum, 2);
    }


}
