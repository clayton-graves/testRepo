package LaunchCode.LCLiveCoding;
/*
In this problem you will be given a string.
You will need to return the string in reverse.
 */
public class ReverseString {
    public static void main(String[] args) {

        String the_string = "LaunchCode";
        char[] chars = the_string.toCharArray();
        String reversed_string = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed_string += chars[i];
        }

        System.out.println(reversed_string);

    }
}
