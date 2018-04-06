package LaunchCode;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the amount of miles you have driven in your car: ");
        double miles = in.nextDouble();
        System.out.println("Please enter the amount of gas in gallons you have consumed: ");
        double gallons = in.nextDouble();
        double mpg = miles / gallons;
        System.out.println("Your car has an mpg rate of " + mpg + ".");

    }
}
