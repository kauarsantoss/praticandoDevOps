import java.util.Scanner;

public class relogio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int H = entrada.nextInt();
        int M = entrada.nextInt();
        int S = entrada.nextInt();
        int T = 1;
        T = entrada.nextInt();

        if (0 <= H && H <= 23 && 0 <= M && M <= 59 && 0 <= S && S <= 59 && 0 <= T && T <= 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10) {
            if ( S + T >= 60 ) {
                S = S + T;
                System.out.println(H);
                System.out.println(M);
                System.out.println(S);
                if ( M + T >= 60 ) {
                    S = 0;
                    T = T - S;
                    M+=1;
                    System.out.println(H);
                    System.out.println(M);
                    System.out.println(S);
                    if ( H + T >= 24 ) {
                        H = 0;
                        M = 0;
                        S = 0;
                        System.out.println(H);
                        System.out.println(M);
                        System.out.println(S);
                    } else {
                        S = 0;
                        T = T - S;
                        M = 0;
                        H+=1;
                        System.out.println(H);
                        System.out.println(M);
                        System.out.println(S);
                    }
                }
                System.out.println(H);
                System.out.println(M);
                System.out.println(S);
            }
            System.out.println(H);
            System.out.println(M);
            System.out.println(S);

            /*for ( S=1; S <= 59; S+=T) {
                int v = S - T;
                System.out.println(S - v );
                System.out.println(M + v);
            }*/
        }
    }
}

// S = 42, T = 23 | 42 - 17 = 59 => [(23-17) + T ] - 1 => M + 1
