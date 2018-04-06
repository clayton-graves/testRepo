package hackerRank;

public class SimpleArraySum {
    //ADDS ALL ITEMS IN ARRAY AND RETURNS THE SUM
    public static void main(String[] args){
        System.out.println(test());
    }
    static int simpleArraySum(int[] ar) {

        int sum = 0;
        for(int x : ar){
            sum += x;
        }
        return sum;
    }
    static int test(){
        int[] array = new int[]{1,3,4,6,8,9};
        return simpleArraySum(array);
    }
}
