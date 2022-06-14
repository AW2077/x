import java.util.*;

public class Main {

    public static <E> void isEqualTo(E inputA, E inputB )
    {
        if ( inputA.equals( inputB ) ) {
            System.out.print( "\n       True" );
        }
        else{
        System.out.print( "\n       False" );
        }
    }

    public static void main(String[] args) {
        int intA, intB;

        Scanner input = new Scanner( System.in );
        System.out.print( "Pierwszy int: " );
        intA = input.nextInt();
        System.out.print( "Drugi int: " );
        intB = input.nextInt();

        isEqualTo(intA,intB );


        System.out.println( "\n\nObiekty" );
        Object objectA = new Object();
        Object objectB = new Object();

        isEqualTo( objectA, objectB );

    }
}