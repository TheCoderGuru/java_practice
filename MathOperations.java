// . Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers

import java.util.Scanner;

public class MathOperations{

    public static void main( String[] args ){
        
        Scanner sc = new Scanner( System.in );

        System.out.print( "Please enter two integers: " );

        int num1 = sc.nextInt();

        int num2 = sc.nextInt();

        sc.close();

        System.out.println( multiply( num1, num2, num1 * num2 ) );
        System.out.println( add( num1, num2, num1 + num2 ) );
        System.out.println( subtract( num1, num2, num1 - num2 ) );
        System.out.println( divide( num1, num2, num1 / num2 ) );
        System.out.println( modulus( num1, num2, num1 % num2 ) );

    }

    public static String multiply( int a, int b, int c ){

        return String.format( a + " * " + b + " = " + c );
    }

    public static String add( int a, int b, int c ){

        return String.format( a + " + " + b + " = " + c );
    }

    public static String subtract( int a, int b, int c ){

        return String.format( a + " - " + b + " = " + c );
    }

    public static String divide( int a, int b, int c ){

        return String.format( a + " / " + b + " = " + c );
    }

    public static String modulus( int a, int b, int c ){

        return String.format( a + " mod " + b + " = " + c );
    }
}