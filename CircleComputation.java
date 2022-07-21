// Use Math.PI to reference the pi value in java

public class CircleComputation{

    public static void main( String[] args ){

        System.out.println( perimeter( 7.5 ) );

        System.out.println( area( 7.5 ) );
    }

    public static double perimeter( double radius ){
        return 2 * Math.PI * radius;
    }

    public static double area( double radius ){
        return Math.PI * radius * radius;
    }
}