package Ejemplo_Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AbrirArchivo {

    public static void main(String[] args) {
        String nombre1 = "Fichero1.txt";
        String nombre2 = "Fichero2.txt";
        String nombre3 = "Fichero3.txt";

        System.out.print("Leer un archivo: \t\t\t\t\t\t\t\t\t");
        System.out.println(LeerArchivoCompleto(nombre3));
        System.out.print("Asignar elementos a ArrayList de tipo String con Scanner: \t\t\t\t");
        System.out.println(LineaArrayListScannerString(nombre2));
        System.out.print("Asignar elementos a ArrayList de tipo Integer con Scanner: \t\t\t\t");
        System.out.println(LineaArrayListScannerInteger(nombre1));
        System.out.print("Asignar elementos a ArrayList de tipo String con BufferReader: \t\t\t\t");
        System.out.println(LineaArrayListScannerString(nombre2));
        System.out.print("Asignar elementos a ArrayList de tipo Integer con BufferReader: \t\t\t");
        System.out.println(LineaArrayListScannerInteger(nombre1));
        System.out.print("String a ArrayList: \t\t\t\t\t\t\t\t\t");
        System.out.println(StringaArray(nombre3));

    }

    public static String LeerArchivoCompleto(String nombre) {
        String lectura = "";
        try (FileReader fr = new FileReader(nombre)) {
            int data = fr.read();
            while (data != -1) {
                lectura += (char) data;
                data = fr.read();
            }
            fr.close();
            return lectura;
        } catch (IOException e) {
            System.out.println("Error leyendo fichero " + nombre + ": " + e);
        }
        return lectura;
    }

    static ArrayList<String> LineaArrayListBufferReaderString(String nombre) {
        ArrayList<String> nuevo = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombre));
            while (br.ready()) {
                nuevo.add(br.readLine());
            }
            br.close();
            return nuevo;
        } catch (IOException | NumberFormatException e) {
            System.out.println("Excepcion leyendo fichero " + nombre + ": " + e);
        }
        return nuevo;
    }

    static ArrayList<String> StringaArray(String nombre) {
        ArrayList<String> nuevo = new ArrayList<>();
        try {
            String vacio = "";
            Scanner s = new Scanner(new FileReader(nombre));
            vacio += s.nextLine();
            String[] valores = vacio.split("-");
            nuevo = new ArrayList<>(Arrays.asList(valores));
            return nuevo;
        } catch (NumberFormatException | IOException e) {
            System.out.println("Excepcion leyendo fichero " + nombre + ": " + e);
        }
        return nuevo;
    }

    static ArrayList<String> LineaArrayListBufferReaderInteger(String nombre) {
        ArrayList<String> nuevo = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombre));
            while (br.ready()) {
                nuevo.add(br.readLine());
            }
            br.close();
            return nuevo;
        } catch (IOException | NumberFormatException e) {
            System.out.println("Excepcion leyendo fichero " + nombre + ": " + e);
        }
        return nuevo;
    }

    static ArrayList<String> LineaArrayListScannerString(String nombre) {
        ArrayList<String> nuevo = new ArrayList<>();
        try {
            Scanner s = new Scanner(new FileReader(nombre));
            while (s.hasNext()) {
                nuevo.add(s.nextLine());
            }
            return nuevo;
        } catch (IOException | NumberFormatException e) {
            System.out.println("Excepcion leyendo fichero " + nombre + ": " + e);
        }
        return nuevo;
    }

    static ArrayList<String> LineaArrayListScannerInteger(String nombre) {
        ArrayList<String> nuevo = new ArrayList<>();
        try {
            Scanner s = new Scanner(new FileReader(nombre));
            while (s.hasNext()) {
                nuevo.add(s.nextLine());
            }
            return nuevo;
        } catch (IOException | NumberFormatException e) {
            System.out.println("Excepcion leyendo fichero " + nombre + ": " + e);
        }
        return nuevo;
    }

}
