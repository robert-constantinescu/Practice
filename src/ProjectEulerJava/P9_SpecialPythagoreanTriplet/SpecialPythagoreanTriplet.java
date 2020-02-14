package ProjectEulerJava.P9_SpecialPythagoreanTriplet;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SpecialPythagoreanTriplet {

    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("#.#");
        for (int i = 1; i < 1000; i++) {
            for (int j = 2; j < 1000; j++) {
                double[] pythagoreanTriples = generatePythagoreanTriples(i, j);

                if (pythagoreanTriples[0] + pythagoreanTriples[1] + pythagoreanTriples[2] == 1000 &&
                        arePythagoreanTriples(pythagoreanTriples[0], pythagoreanTriples[1], pythagoreanTriples[2])) {
                    System.out.println(Arrays.toString(pythagoreanTriples));
                    double product = pythagoreanTriples[0] * pythagoreanTriples[1] * pythagoreanTriples[2];
                    System.out.println("Product is: " + format.format(product));
                    return;
                }

            }
        }
    }


    public static boolean arePythagoreanTriples(double a, double b, double c) {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(a);numbers.add(b);numbers.add(c);
        Collections.sort(numbers);
        double c1 = numbers.get(0); double c2 = numbers.get(1); double ip = numbers.get(2);
        if (Math.pow(c1, 2) + Math.pow(c2, 2) == Math.pow(ip,2))
            return true;
        else
            return false;
    }

    public static double[] generatePythagoreanTriples(double a, double b) {
        double[] theTriples = new double[3];

        double c1 = 2 * a * b;
        theTriples[0] = c1;
        double c2 = Math.abs(Math.pow(a, 2) - Math.pow(b, 2));
        theTriples[1] = c2;
        double ip = Math.pow(a,2) + Math.pow(b,2);
        theTriples[2] = ip;

        return theTriples;
    }


}
