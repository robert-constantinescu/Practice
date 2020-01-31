package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a004_DeadFish {

    /*
    Write a simple parser that will parse and run Deadfish.

    Deadfish has 4 commands, each 1 character long:

    i increments the value (initially 0)
    d decrements the value
    s squares the value
    o outputs the value into the return array
    Invalid characters should be ignored.

    Deadfish.parse("iiisdoso") =- new int[] {8, 64};
     */

    public static void main(String[] args) {
        String commands = "iiisdoso";
        int[] result =  parse(commands);
        System.out.println(Arrays.toString(result));
    }

    public static int[] parse(String data) {
        int fish = 0;
        List<Integer> output = new ArrayList<>();
        for (char c: data.toCharArray()) {
            switch (c) {
                case 'i': fish += 1; break;
                case 'd': fish -= 1; break;
                case 's': fish *= fish; break;
                case 'o': output.add(fish);
            }
        }
        return output.stream().mapToInt(i -> i).toArray();
    }


}
