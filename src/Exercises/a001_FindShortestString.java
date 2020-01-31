package Exercises;

import java.util.Arrays;
import java.util.stream.IntStream;

public class a001_FindShortestString {

    public static void main(String[] args) {


    }

    public static int findShort(String phrase) {
        String[] arr = phrase.split(" ");
        int min = -1;
        for (String x: arr) {
            if (min == -1) {
                min = x.length();
            }
            else if(min > x.length()) {
                min = x.length();
            }
        }
        return min;
    }

    public static IntStream findShortWithStreams(String phrase) {
        return Arrays.stream(phrase.split(" ")).mapToInt(String::length);
    }
}
