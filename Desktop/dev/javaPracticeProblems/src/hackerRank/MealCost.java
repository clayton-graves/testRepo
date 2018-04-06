package hackerRank;
/*
Calculate the meal cost.
base cost + tax
base cost + tip
rounded
 */

import java.util.Scanner;

public class MealCost {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the meal cost: ");
        double mealCost = in.nextDouble();
        System.out.println("Enter the tip percentage: ");
        int tipPercent = in.nextInt();
        System.out.println("Enter the tax percentage: ");
        int taxPercent = in.nextInt();
        in.close();
        double tax = mealCost * (taxPercent / 100.0);   //WILL NOT WORK IF YOU DIVIDE BY 100, MUST DIVIDE DOUBLE BY TYPE DOUBLE
        double tip = mealCost * (tipPercent / 100.0);
        double unroundedCost = mealCost + tip + tax;
        int totalCost = (int) Math.round(unroundedCost);
        System.out.println(totalCost);
        System.out.println(tax);
        System.out.println(tip);
    }
}
