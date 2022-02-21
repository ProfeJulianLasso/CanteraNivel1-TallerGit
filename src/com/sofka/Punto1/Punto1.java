package com.sofka.Punto1;

import java.util.Scanner;

public class Punto1 {

    private String nombre;
    private String apellidos;

    public void Punto1() {

        solicitarNombre();
        nombre = capturarDato();

        solicitarApellido();
        apellidos = capturarDato();

    }

    private void solicitarNombre() {
        System.out.println("Por favor digite su nombre");
    }

    private void solicitarApellido() {
        System.out.println("Por favor digite su apellido");
    }

    private String capturarDato() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

}
