package hackerRank;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an int: ");
        int num = in.nextInt();
        System.out.println("Enter a double: ");
        double dub = in.nextDouble();
        System.out.println("Enter a string: ");
        in.nextLine();      //THIS LINE IS REQUIRED TO ACCESS THE STRING, WITHOUT IT, THE SCANNER READS THE ENTER KEY AFTER THE DOUBLE IS ENTERED
        String phrase = in.nextLine();
        in.close();
        System.out.println(num);
        System.out.println(dub);
        System.out.println(phrase);
    }
}
