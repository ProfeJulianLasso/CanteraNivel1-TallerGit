package com.sofka;

import com.sofka.Punto1.Punto1;
import com.sofka.Punto2.Punto2;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static boolean bandera = true;
    private static int opcion;

    public static void main(String[] args) throws IOException {
        do {
            limpiarPantalla();
            menu();
            opcion = capturarOpcion();
            bandera = evaluarOpcion(opcion);
        } while (bandera == true);
    }

    private static void menu() {
        System.out.println("Escoja un punto del taller");
        System.out.println("1. Punto #1");
        System.out.println("2. Punto #2");
        System.out.println("0. Salir del taller");
    }

    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                Punto1 p1 = new Punto1();
                p1.Punto1();
                return true;
                // break;
            case 2:
                Punto2 p2 = new Punto2();
                p2.Punto2();
                return true;
            // break;
            case 0:
                return false;
                // break;
            default:
                System.out.println("Opción incorrecta");
                System.in.read();
        }
        return true;
    }

    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
