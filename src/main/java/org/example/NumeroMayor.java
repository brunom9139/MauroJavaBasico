package org.example;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el 1er nro ");
        int numero1 = scanner.nextInt();
        System.out.println("ingrese el 2do nro ");
        int numero2 = scanner.nextInt();

        /*if (numero1 > numero2){
            System.out.println(" el mayor es "+ numero1);
        } else{
            System.out.println(" el mayor es "+ numero2);
        } */

        if (numero1 < numero2){
            System.out.println("el menor es "+ numero1);
        } else{
            System.out.println("el menor es "+ numero2);
        }
    }
}
