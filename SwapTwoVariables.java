import java.util.Scanner;

public class SwapTwoVariables{

    public static void main( String args[] ){

        Scanner sc = new Scanner( System.in );

        System.out.print( "Please enter two numbers that you would like to swap? " );

        int num1 = sc.nextInt();

        int num2 = sc.nextInt();

        System.out.println( swapVariables( num1, num2 ) );
    }

    public static String swapVariables( int a, int b ){

        // set the value of a equal to b and vice versa
        
        // if a is 1 then b is equal to a


        a = a + b;
        b = a - b;
        a = a - b;

        return String.format( a + " " + b );

    }
}