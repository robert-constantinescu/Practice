package Exercises;

import java.util.*;

public class a006_PrizeDraw {

    public static void main(String[] args) {
        int Paul = calculateNameScore("Paul") * 2;
        int Elizabeth = calculateNameScore("Elizabeth") * 5;
        int Matthew = calculateNameScore("Matthew") * 5;
        System.out.println(Elizabeth);
        System.out.println(Matthew);
        System.out.println(Paul);

        String st = "Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden";
        Integer[] we = new Integer[] {1, 3, 5, 5, 3, 6};

        st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
        we = new Integer[] {4, 2, 1, 4, 3, 1, 2};


        st = "";
        we = new Integer[] {4, 2, 1, 4, 3, 1, 2};

        String theWinner = nthRank(st, we, 4);
        System.out.println(theWinner);
    }

    static String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    static HashMap<String, Integer> letterScore = lettersToRank(letters);

    private static HashMap<String, Integer> lettersToRank(String[] lettersArray) {
        HashMap<String, Integer> lettersToRankMap = new HashMap<>();
        for(int i = 0; i <lettersArray.length; i++) {
            lettersToRankMap.put(lettersArray[i], i+1);
        }
        return lettersToRankMap;
    }

    public static String nthRank(String st, Integer[] we, int n) {
        if (st.isEmpty()) {
            return "No Participants";
        }
        String[] names = st.split(",");
        if (n > names.length) {
            return "Not enough participants";
        }
        else {
            TreeMap<Integer, TreeSet<String>> namesToScoreMap = mapNameToScore(names, we);
            ArrayList<String> namesRanked =  rankNames(namesToScoreMap);
            System.out.println(namesRanked);
            return namesRanked.get(n-1);
        }
    }

    private static ArrayList<String> rankNames (TreeMap<Integer, TreeSet<String>> namesToScore) {
        ArrayList<String> namesRanked = new ArrayList<>();
        while(namesToScore.size() != 0) {
            Map.Entry<Integer, TreeSet<String>> entrySet = namesToScore.pollLastEntry();
            namesRanked.addAll(entrySet.getValue());
        }
        return namesRanked;
    }

    private static TreeMap<Integer, TreeSet<String>> mapNameToScore(String[] names, Integer[] weights) {
        TreeMap<Integer, TreeSet<String>> namesToScoreMap = new TreeMap<>();
        for (int i = 0; i < names.length; i++) {
            int score = calculateNameScore(names[i]) * weights[i];
            try {
                TreeSet<String> namesForScore = namesToScoreMap.get(score);
                namesForScore.add(names[i]);
                namesToScoreMap.put(score, namesForScore);
            }catch (NullPointerException e) {
                TreeSet<String> namesForScore = new TreeSet<>();
                namesForScore.add(names[i]);
                namesToScoreMap.put(score, namesForScore);
            }
        }
        return namesToScoreMap;
    }

    private static int calculateNameScore(String name) {
        String[] letters = name.split("");
        int sum = 0;
        for(String l: letters) {
            sum += letterScore.get(l.toLowerCase());
        }
        sum += letters.length;
        return sum;
    }
}
