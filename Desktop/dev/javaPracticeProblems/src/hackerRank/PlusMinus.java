package hackerRank;

public class PlusMinus {
    //YOU MUST CALCULATE THE RATIO OF POSITIVE, NEGATIVE, AND ZEROES GIVEN THE ARRAY AND ARRAY SIZE. OUTPUT MUST BE THREE DECIMALS REPRESENTING EACH
    public static void main(String[] args){
        int[] array = new int[]{1,-2,-3,0,9};
        plusMinus(array);
    }
    static void plusMinus(int[] arr) {
        float length = arr.length;
        float pos = 0;
        float neg = 0;
        float zer = 0;
        for (int x : arr){
            if(x > 0){
                pos +=1;
            }
            if (x < 0){
                neg +=1;
            }
            if (x == 0){
                zer +=1;
            }
        }
        float posrat = pos/length;
        float negrat = neg/length;
        float zerrat = zer/length;
        System.out.println(posrat);
        System.out.println(negrat);
        System.out.print(zerrat);
    }
}
