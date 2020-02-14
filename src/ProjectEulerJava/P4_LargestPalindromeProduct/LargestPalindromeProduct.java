package ProjectEulerJava.P4_LargestPalindromeProduct;

import java.util.*;

public class LargestPalindromeProduct {

    public static void main(String[] args) {
        List<Integer> palindromes = new ArrayList<>();
        long startDate = System.currentTimeMillis();
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                int product = i * j;
                int productPalindrome = returnReversed(product);
                if (product == productPalindrome) {
                    palindromes.add(productPalindrome);
                }
            }
        }
        long endDate = System.currentTimeMillis();
        long elapsed = endDate - startDate;
        System.out.println(startDate + ", " + endDate + " diff: " + elapsed);
        System.out.println(palindromes);
        System.out.println(Collections.max(palindromes));



        List<Integer> palindromesSecond = new ArrayList<>();
        long startDate1 = System.currentTimeMillis();
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                String product = String.valueOf(i * j);
                String palindrome = returnReversedString(product);
                if (product.equals(palindrome)) {
                    palindromesSecond.add(Integer.parseInt(palindrome));
                }
            }
        }
        long endDate1 = System.currentTimeMillis();
        long elapsed1 = endDate1 - startDate1;
        System.out.println(startDate1 + ", " + endDate1 + " diff: " + elapsed1);
        System.out.println(palindromesSecond);
        System.out.println(Collections.max(palindromesSecond));
    }


    public static int returnReversed(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        char[] palindrome = new char[String.valueOf(n).length()];
        for (int i = digits.length - 1; i >=0; i--) {
            palindrome[digits.length -i - 1] = digits[i];
        }
        return Integer.parseInt(String.valueOf(palindrome));
    }



    public static String returnReversedString(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return reversed;
    }


}
