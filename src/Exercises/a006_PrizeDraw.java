package Exercises;


import java.util.*;

public class a006_PrizeDraw {

    /*
    DESCRIPTION OF THE EXERCISE
    https://www.codewars.com/kata/5616868c81a0f281e500005c
     */

    public static void main(String[] args) {
        int Paul = calculateNameScore("Paul") * 2;
        int Elizabeth = calculateNameScore("Elizabeth") * 5;
        int Matthew = calculateNameScore("Matthew") * 5;
//        System.out.println(Elizabeth);
//        System.out.println(Matthew);
//        System.out.println(Paul);

        String st = "Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden";
        Integer[] we = new Integer[] {1, 3, 5, 5, 3, 6};
        String theWinner = nthRank(st, we, 2);
        System.out.println(theWinner);

        st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
        we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
        theWinner = nthRank(st, we, 4);
        System.out.println(theWinner);

        st = "";
        we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
        theWinner = nthRank(st, we, 4);
        System.out.println(theWinner);
    }


    private static String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private static HashMap<String, Integer> letterScore = lettersToRank(letters);

    private static HashMap<String, Integer> lettersToRank(String[] lettersArray) {
        HashMap<String, Integer> lettersToRankMap = new HashMap<>();
        for(int i = 0; i <lettersArray.length; i++) {
            lettersToRankMap.put(lettersArray[i], i+1);
        }
        return lettersToRankMap;
    }


    public static String nthRank(String st, Integer[] we, int n) {
        if (st.isEmpty()) { return "No Participants"; }
        String[] names = st.split(",");
        if (n > names.length) { return "Not enough participants"; }
        else {
            ParticipantTreeSet participantTreeSet = new ParticipantTreeSet();
            for (int i = 0; i < names.length; i++) {
                int score = calculateNameScore(names[i]) * we[i];
                Participant participant = new Participant(names[i], score);
                participantTreeSet.add(participant);
            }
            ArrayList<Participant> participants = participantTreeSet.toArrayList();
            System.out.println(participants);
            return participants.get(n-1).getName();
        }
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

    public static class Participant implements Comparable<Participant>{
        private String name;
        private int score;

        public Participant(String name, int score) {
            this.name = name;
            this.score= score;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        @Override
        public String toString() {
            return  "{'" + name + '\'' + "," + score + "}";
        }

        @Override
        public int compareTo(Participant o) {
            if (o.getScore() == this.getScore())
                return this.getName().compareTo(o.getName());
            return o.getScore() - this.getScore();
        }
    }

    public static class ParticipantTreeSet implements Iterable<Participant> {
        private final Set<Participant> participants= new TreeSet<>();

        @Override
        public Iterator<Participant> iterator() {
            return participants.iterator();
        }

        public void add(Participant p) {
            participants.add(p);
        }

        @Override
        public String toString() {
            return participants.toString();
        }

        public ArrayList<Participant> toArrayList() {
            ArrayList<Participant> participants = new ArrayList<>();
            participants.addAll(this.participants);
            return  participants;
        }
    }
}
