package hackerRank;

import java.util.Arrays;

public class BirthdayCandles {
    /*
    RECEIVE AN ARRAY AND AN INT (AGE). ARRAY REPRESENTS THE HEIGHTS OF THE CANDLES.
    ONLY THE TALLEST ONES CAN BE BLOWN OUT. CALCULATE HOW MANY CANDLES WILL BE BLOWN OUT.
     */
    public static void main(String[] args){
        int[] argh = new int[]{1,2,2,3,3,4,5,5};
        System.out.println(birthdayCakeCandles(argh.length,argh));
    }
    static int birthdayCakeCandles(int n, int[] ar) {
        Arrays.sort(ar);
        int max = ar[n-1];
        int count = 0;
        for (int i : ar){
            if(i == max){
                count++;
            }
        }
        return count;
    }
}
