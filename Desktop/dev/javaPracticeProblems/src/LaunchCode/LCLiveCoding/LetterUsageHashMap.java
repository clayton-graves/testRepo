package LaunchCode.LCLiveCoding;

import java.util.HashMap;
import java.util.Map;

public class LetterUsageHashMap {
    public static void main(String[] args) {

        String word = "My name is Fred";
        char[] words = word.toCharArray();
        Map<Character, Integer> letters = new HashMap<>();


        for(char letter : words){
            if (letters.containsKey(letter)){
                int amount = letters.get(letter);
                letters.put(letter, (amount + 1));
            }
            else {
                letters.put(letter, 1);
            }

        }

        System.out.println(letters);

    }
}
