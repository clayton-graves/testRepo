package hackerRank;

public class AVeryBigSum {
    //CALCULATES THE SUM OF AN ARRAY WITH VERY LARGE NUMBERS. TAKES AN ARRAY AND THE SIZE OF THE ARRAY AS INPUT
    public static void main(String[] args){
        test();
    }
    static long aVeryBigSum(int n, long[] ar) {

        long sum = 0;
        for (long x : ar){
            sum += x;
        }
        return sum;
    }
    public static void test(){
        long[] bigBoi = new long[]{50000032, 4032, 5001, 2001, 3007};
        System.out.println(aVeryBigSum(5,bigBoi));
    }

}
