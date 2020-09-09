package td_desafios_1;

import java.util.Scanner;

public class SumaImparLimite {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int i;
        int suma = 0;
        for (i = min; i <= max; i++) {
            if (i % 2 == 1) {
                suma += i;
                System.out.println(suma);
            }
        }
        System.out.printf("%d\n", suma);
    }

}
