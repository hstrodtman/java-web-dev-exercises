package class1;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        int miles = input.nextInt();
        System.out.println("How many gallons of gas have you used?");
        int gallons = input.nextInt();
        input.close();
        double mpg = miles / gallons;
        System.out.println("You got " + mpg + " miles per gallon.");
    }
}
