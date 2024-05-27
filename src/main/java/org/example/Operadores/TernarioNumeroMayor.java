package org.example.Operadores;

import java.util.Scanner;

public class TernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un numero ");
        int Nro1 = s.nextInt();

        System.out.println("Ingrese un 2do numero");
        int Nro2 = s.nextInt();

        System.out.println("Ingrese un 3er numero ");
        int Nro3 = s.nextInt();

        System.out.println("Ingrese un 4to numero ");
        int Nro4 = s.nextInt();

        max = (Nro1 > Nro2) ? Nro1: Nro2;
        max =(max > Nro3)? max: Nro3;
        max =(max > Nro4)? max: Nro4;

        System.out.println("Nro1 = " + Nro1);
        System.out.println("Nro2 = " + Nro2);
        System.out.println("Nro3 = " + Nro3);
        System.out.println("Nro4 = " + Nro4);
        System.out.println("El nro mayor es " + max);
    }
}
