// Write a Java program to print the division of two numbers

import java.util.Scanner;

public class DivideTwoNumbers{

    public static void main( String args[] ){

        Scanner sc = new Scanner( System.in );

        System.out.print( "Please enter two numbers to divide: " );

        int num1 = sc.nextInt();

        int num2 = sc.nextInt();

        sc.close();
        
        System.out.print( num1 / num2 );
    }
}