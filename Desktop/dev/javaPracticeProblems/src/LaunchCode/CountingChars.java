package LaunchCode;

import java.util.HashMap;
import java.util.Map;

public class CountingChars {
    public static void main(String[] args){
        String sentence = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        char[] charsInSentence = sentence.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : charsInSentence){
            /*int count = 1;
            charCount.put(c, count);
            */
            if (charCount.containsKey(c)){
                /*int update = c.getValue();*/
                int update = charCount.get(c);
                update ++;
                charCount.replace(c, update);
            }
            else{
                int count = 1;
                charCount.put(c, count);
            }
        }


        System.out.println("\nCharacter count: ");
        for (Map.Entry<Character, Integer> aChar : charCount.entrySet()){
            System.out.println(aChar.getKey()+": " + aChar.getValue() + ".");

        }
    }
}
