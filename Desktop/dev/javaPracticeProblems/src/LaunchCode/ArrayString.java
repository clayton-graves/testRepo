package LaunchCode;

import java.util.ArrayList;

public class ArrayString {
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<>();

        words.add("Five");
        words.add("Flour");
        words.add("Pizza");
        words.add("Truck");
        words.add("Flint");
        words.add("Cradle");
        words.add("Violin");
        System.out.println("List of words is: " + words + ".");
        for (String i : words){
            if (i.length() == 5){
                System.out.println(i);
            }
        }

    }
}
