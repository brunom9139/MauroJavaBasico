package org.example;

import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ingrese el 1er nro ");
        int numero1 = scanner.nextInt();
        System.out.println(" ingrese el 2do nro ");
        int numero2 = scanner.nextInt();
        System.out.println(" ingrese el 3er nro ");
        int numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println(numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println(numero2);
        } else if (numero3 > numero2 && numero3 > numero1) {
            System.out.println(numero3);
        } else if (numero1 == numero3 && numero2 == numero1) {
            System.out.println(numero1);
        }

    }
}
