package LaunchCode;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String wonderland = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Enter a word to search for in the sentence: ");
        String word = in.nextLine();
        if (wonderland.toLowerCase().indexOf(word.toLowerCase())!= -1){
            System.out.println("Word found.");

        }
        else{
            System.out.println("Word not found.");
        }
    }
}
