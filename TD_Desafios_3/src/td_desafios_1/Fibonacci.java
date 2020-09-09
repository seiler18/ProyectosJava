package td_desafios_1;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fSuma = 0;
        int fPrevio = 1;
        int fPrevioPrevio = 0;

        if (n == 0) {
            System.out.printf("%d\n", fPrevioPrevio);
        } else {
            System.out.printf("%d\n%d\n", fPrevioPrevio, fPrevio);
            for (int i = 0; i < n - 1; i++) {
                fSuma = fPrevio + fPrevioPrevio;
                System.out.printf("%d\n", fSuma);
                fPrevioPrevio = fPrevio;
                fPrevio = fSuma;
            }
        }
    }

}
