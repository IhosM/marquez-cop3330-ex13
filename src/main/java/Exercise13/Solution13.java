/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Ihosvany Marquez
 */


package Exercise13;
import java.util.Scanner;


public class Solution13
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);


        System.out.print("What is the principal amount? ");
        int principal = scan.nextInt();

        System.out.print("What is the rate? ");
        double rate = scan.nextDouble();

        System.out.print("What is the number of years? ");
        int year = scan.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int compound = scan.nextInt();

        double total = principal*Math.pow(1 + ((rate * 0.01) / compound),compound * year);

        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n",
                principal, rate, year, compound, total);
    }
}
