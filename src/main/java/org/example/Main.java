package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la cédula del estudiante: ");
        String cedula = scanner.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer

        System.out.print("Ingrese la dirección del estudiante: ");
        String direccion = scanner.nextLine();

        System.out.print("Ingrese el teléfono del estudiante: ");
        String telefono = scanner.nextLine();

        System.out.print("Ingrese el correo del estudiante: ");
        String correo = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombre, cedula, edad, direccion, telefono, correo);

        System.out.println("******* Estudiante ingresado ******* \n" + estudiante);
    }
}