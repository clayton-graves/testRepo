package hackerRank;

public class BreakingTheRecords {
    /*
    RECEIVE AN INTEGER ARRAY AND THE SIZE, THE FIRST ITEM IN THE ARRAY REPRESENTS THE BEST AND WORST SCORE.
    CALCULATE HOW MANY TIMES THE BEST AND WORST SCORES ARE BROKEN, FOR EACH BRAKE, UPDATE THE BEST/WORST SCORE.
     */


    public static void main(String[] args){
        int[] array = new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1};
        breakingRecords(array);
    }
    static int[] breakingRecords(int[] score) {
        int bestBreak = 0;
        int worstBreak = 0;
        int highscore = score[0];
        int lowscore = score[0];
        for (int i: score){
            if (i > highscore){
                highscore = i;
                bestBreak++;
            }
            if (i < lowscore){
                lowscore = i;
                worstBreak++;
            }
        }
        int[] result = new int[]{bestBreak, worstBreak};
        System.out.println(bestBreak + " " + worstBreak);
        return result;
    }
}
