package Exercises;

import java.util.Arrays;

public class a003_TwoSum {

        /*
    Write a function that takes an array of numbers (integers for the tests) and a target number. It should find two different
    items in the array that, when added together, give the target value. The indices of these items should then be returned in a tuple like so: (index1, index2).

    For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.

    The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers;
     target will always be the sum of two different items from that array).
     */

    public static void main(String[] args) {
        int[] toTest = new int[]{1, 2, 3};
        int[] result =  twoSum(toTest, 4);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] numbers, int target)  {
        int[] tuple =  new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    tuple[0] = i;
                    tuple[1] = j;
                }
            }
        }
        return tuple; // Do your magic!
    }
}
