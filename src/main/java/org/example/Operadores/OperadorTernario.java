package org.example.Operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7 == 5 ? "si es verdadero " : "si es falso ";
        System.out.println("variable = " + variable);

        String estado = "";

        double promedio = 0.0;

        double ciencia = 0.0;
        double informatica = 0.0;
        double lengua = 0.0;
        double arte = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota de ciencias ");
        ciencia = scanner.nextDouble();

        System.out.println("Ingrese la nota de informatica ");
        informatica = scanner.nextDouble();

        System.out.println("Ingrese la nota de lengua ");
        lengua = scanner.nextDouble();

        System.out.println("Ingrese la nota de arte ");
        arte = scanner.nextDouble();

        promedio = (ciencia + informatica + lengua + arte) / 4;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.50 ? "aprobado " : "desaprobado ";
        System.out.println("estado = " + estado);

    }
}
