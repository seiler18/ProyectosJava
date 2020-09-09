package servicio;

import java.util.Scanner;

public abstract class Escaner {

    static Scanner sc = new Scanner(System.in);

    public static Integer leerNumeroConMensaje(int maximo, int minimo, String mensaje) {
        System.out.println(mensaje);
        int valor = 0;
        while (valor == 0) {
            try {
                valor = Integer.parseInt(sc.nextLine());
                if (valor <= maximo && valor >= minimo) {
                    return valor;
                } else {
                    valor = -1;
                }
            } catch (Exception e) {
            } finally {
                if (valor == -1) {
                    System.out.println("Ingrese un numero valido");
                }
                valor = 0;
            }
        }
        return null;
    }

    public static String leerStringConMensaje(String mensaje) {
        System.out.println(mensaje);
        try {
            return sc.nextLine();
        } catch (Exception e) {
            System.out.println("Ingrese un valor valido");
        }
        return null;
    }

    public static String leerRespuestaStringConMensaje(String mensaje) {
        System.out.println(mensaje);
        int valor = 0;
        while (valor == 0) {
            System.out.println("Ingrese Y para si o N para no");
            try {
                String codigo = sc.nextLine();
                if (codigo.equals("Y") || codigo.equals("N")) {
                    return codigo;
                }
            } catch (Exception e) {
            } finally {
                valor = 0;
            }
        }
        return null;
    }
}
