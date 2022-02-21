package com.sofka.Punto2;

import java.util.Scanner;

public class Punto2 {

    private String nombre;
    private String apellidos;
    private int edad;
    private double estatura;
    private Scanner input;

    public void Punto2() {

        input = new Scanner(System.in);

        solicitarNombre();
        nombre = capturarDatoString();

        solicitarApellido();
        apellidos = capturarDatoString();

        solicitarEdad();
        edad = capturarDatoInt();

        solicitarAltura();
        estatura = capturarDatoDouble();

    }

    private void solicitarNombre() {
        System.out.println("Por favor digite su nombre");
    }

    private void solicitarApellido() {
        System.out.println("Por favor digite su apellido");
    }

    private void solicitarEdad() {
        System.out.println("Por favor digite su edad");
    }

    private void solicitarAltura() {
        System.out.println("Por favor digite su altura");
    }

    private String capturarDatoString() {
        return input.nextLine();
    }

    private int capturarDatoInt() {
        return input.nextInt();
    }

    private double capturarDatoDouble() {
        return input.nextDouble();
    }

}
