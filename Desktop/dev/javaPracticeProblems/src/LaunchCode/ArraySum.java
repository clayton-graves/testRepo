package LaunchCode;

import java.util.ArrayList;

public class ArraySum {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i=1; i < 11; i++)
            list.add(i);
        for (int i : list){
            if (i%2 == 0){
                sum += i;
            }
        }
        System.out.println("Sum of all the even numbers in the array is: " + sum + ".");
    }
}
