package LaunchCode;

import java.util.Scanner;

public class AreaOfRect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a width for the rectangle: ");
        int width = in.nextInt();
        System.out.println("Please enter a height for the rectangle: ");
        int height = in.nextInt();
        int area = width * height;
        System.out.println("The area of the rectangle is: " + area +".");

    }
}
