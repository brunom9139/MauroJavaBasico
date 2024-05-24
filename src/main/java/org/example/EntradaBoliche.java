package org.example;

import java.util.Scanner;

public class EntradaBoliche {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad ");
        int edad = scanner.nextInt();

        if (edad >= 18){
            System.out.println("puedes pasar papito ");
        } else{
            System.out.println("no podes entrar rey ");
        }
    }




}
