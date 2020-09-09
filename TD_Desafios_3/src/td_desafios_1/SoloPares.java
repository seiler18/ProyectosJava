package td_desafios_1;

import java.util.Scanner;

public class SoloPares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 0;
        int cantidadPares = 0;
        while (cantidadPares < n) {
            if (i % 2 == 0) {
                System.out.printf("%d\n", i);
                cantidadPares += 1;
            }
            i++;
        }
    }
}
