package hackerRank;

public class ReverseString {
    public static void main(String[] args){

        System.out.print(test());
    }
    public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        String reverse = "";
        int length = arr.length;
        for (int i = length-1; i >= 0; i--){
            reverse += arr[i];
        }
        return reverse;
    }
    public static String test(){


        return reverseString("Hoochie Mama");
    }
}
