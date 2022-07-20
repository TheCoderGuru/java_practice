import java.util.Scanner;

public class SumTwoNumbers{
    
    public static void main( String[] args ){

        Scanner sc = new Scanner( System.in );

        System.out.print( "Please enter two numbers: " );

        int num1 = sc.nextInt();

        int num2 = sc.nextInt();

        System.out.println( num1 + num2 );
    }
}