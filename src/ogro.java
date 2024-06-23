import java.util.Scanner;

public class ogro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in );
        int E = entrada.nextInt();
        int D = entrada.nextInt();
        if ( 0 <= E && E <= 5 && 0 <= D && D <= 5 && E != D ) {
            if (E > D) {
                System.out.println( E + D );
            } else {
                System.out.println( 2 * (D - E) );
            }
        }
    }
}
