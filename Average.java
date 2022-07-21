import java.util.Scanner;

public class Average{

    public static void main( String[] args ){

        Scanner sc = new Scanner( System.in );

        System.out.print( "Please enter three numbers to calculate an average: " );

        int num1 = sc.nextInt();

        int num2 = sc.nextInt();

        int num3 = sc.nextInt();
        
        System.out.println( average( num1, num2, num3 ) );
    }


    public static int average( int a, int b, int c ){

        return ( a + b + c ) / 3;
    }
}