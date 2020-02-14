package ProjectEulerJava.P5_SmallestMultiple;

public class SmallesMultiple {

    public static void main (String[] args) {
        int n = 1;
        while(true) {
            if (!isSmallestMultiple(n)) {
                n++;
            }
            else {
                System.out.println(n);
                break;
            }
        }
    }

    public static boolean isSmallestMultiple(int n) {
        for (int i = 1; i < 11; i++) {
            if (n % i != 0) {
                return false;
            }
        }
        return true;
    }

}
