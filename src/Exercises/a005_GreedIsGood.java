package Exercises;

import java.util.HashMap;
import java.util.Map;

public class a005_GreedIsGood {
        /*
        Greed is a dice game played with five six-sided dice. Your mission, should you choose to accept it, is to score a throw according to these rules. You will always be given an array with five six-sided dice values.

        Three 1's => 1000 points
        Three 6's =>  600 points
        Three 5's =>  500 points
        Three 4's =>  400 points
        Three 3's =>  300 points
        Three 2's =>  200 points
        One   1   =>  100 points
        One   5   =>   50 point
        A single die can only be counted once in each roll. For example, a "5" can only count as part of a triplet (contributing to the 500 points) or as a single 50 points, but not both in the same roll.

        Example scoring

        Throw       Score
        ---------   ------------------
        5 1 3 4 1   50 + 2 * 100 = 250
        1 1 1 3 1   1000 + 100 = 1100
        2 4 4 5 4   400 + 50 = 450
        In some languages, it is possible to mutate the input to the function. This is something that you should never do. If you mutate the input, you will not be able to pass all the tests.
     */

    public static void main(String[] args) {

        int[] testingValues = new int[]{5,1,5,5,1};
        long start = System.currentTimeMillis();
        greedy(testingValues);
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);


        long start_short= System.currentTimeMillis();
        greedy_short(testingValues);
        long stop_short = System.currentTimeMillis();
        System.out.println(stop_short - start_short);

    }

    public static int greedy(int[] dice){
        HashMap<Integer, Integer> dicesCounted = countDices(dice);
        int score = 0;
        for (Map.Entry<Integer,Integer> entrySet: dicesCounted.entrySet()) {
            int d = entrySet.getKey();
            int freq = entrySet.getValue();
            score += countScore(d, freq);
        }

        System.out.println(score);
        return score;
    }

    public static int greedy_short(int[] dice) {
        int n[] = new int[7];
        for (int d : dice) n[d]++;
        int x = n[1] / 3 * 1000 + n[1] % 3 * 100 + n[2] / 3 * 200 + n[3] / 3 * 300 + n[4] / 3 * 400 + n[5] / 3 * 500 + n[5] % 3 * 50 + n[6] / 3 * 600;
        System.out.println(x);
        return x;
    }


    static HashMap<Integer,Integer> countDices(int[] dice) {
        HashMap<Integer, Integer> valuesCount = new HashMap<>();

        for (int d: dice) {
            if (valuesCount.containsKey(d)) {
                int valueUpdated = valuesCount.get(d) + 1;
                valuesCount.put(d, valueUpdated);
            } else {
                valuesCount.put(d, 1);
            }
        }

        return valuesCount;
    }

    private static int countScore(int dice, int freq) {
        int score = 0;
        switch (dice) {
            case(1): score = scoreForOnes(freq);
                break;
            case(2): score = scoreForTwos(freq);
                break;
            case(3): score = scoreForTrees(freq);
                break;
            case(4): score = scoreForFours(freq);
                break;
            case(5): score = scoreForFives(freq);
                break;
            case(6): score = scoreForSixes(freq);
                break;
        }
        return score;
    }

    private static int scoreForOnes(int freq) {
        int score = 0;
        if (freq < 3) {
            score = freq * 100;
        }
        else if(freq == 3) {
            score = 1000;
        }
        else {
            int n = freq % 3;
            score = 1000 + (n * 100);
        }
        return score;
    }

    private static int scoreForTwos(int freq) {
        return freq < 3 ? 0 : 2 * 100;
    }

    private static int scoreForTrees(int freq) {
        return freq < 3 ? 0 : 3 * 100;
    }

    private static int scoreForFours(int freq) {
        return freq < 3 ? 0 : 4 * 100;
    }

    private static int scoreForFives(int freq) {
        int score = 0;
        if (freq < 3) {
            score = freq * 50;
        }
        else if (freq == 3) {
            score = 500;
        }
        else {
            int n = freq % 3;
            score = 500 + (n * 50);
        }
        return score;
    }

    private static int scoreForSixes(int freq) {
        return freq < 3 ? 0 : 6 * 100;
    }

}
