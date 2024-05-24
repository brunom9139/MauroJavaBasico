package org.example;

import java.util.Scanner;

public class OperacionesCalculadora {
    public static void main(String[] args) {
        //ingresar dos numeros por scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer numero ");
        int numero1 = scanner.nextInt();
        System.out.println("ingrese el segundo numero ");
        int numero2 = scanner.nextInt();

        //una vez ingresados creas 4 variables de tipo int y en cada una almacenas su respectivo valor
        //ejemplo int resultado_suma = numero1 + numero2;
        int resultado_suma = numero1 + numero2;

        int resultado_resta = numero1 - numero2;

        int resultado_multiplicacion = numero1 * numero2;

        float resultado_division = (float) numero1 / numero2;


        //mostrar el resultado de las 4 variables
        //System.out.println("Suma: "+resultado_suma);
        System.out.println("suma : "+ resultado_suma);

        System.out.println("resta : "+ resultado_resta);

        System.out.println("multiplicacion : "+ resultado_multiplicacion);

        System.out.println("division ; "+ resultado_division);
    }
}
