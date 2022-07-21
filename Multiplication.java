//  Write a Java program that takes a number as input and prints its multiplication table upto 10.

import java.util.Scanner;

public class Multiplication{

    public static void main( String[] args ){

        Scanner sc = new Scanner( System.in );

        System.out.print( "Please enter an integer to display a multiplication table: " );

        int num = sc.nextInt();

        sc.close();

        for( int i = 1; i < 11; i++ ){

            int result = num * i;

            System.out.println( multiplication( num, i, result ) );
        }
    }

    public static String multiplication( int a, int b, int c ){

        return String.format( a + " x " +  b + " = " + c );
    }   
}