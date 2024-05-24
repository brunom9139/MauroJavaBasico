package org.example;


import java.util.Scanner;

public class Datos {
    public static void main(String[] args) {
        Scanner pepito = new Scanner(System.in);

        System.out.println("ingrese su nombre ");
        String nombre = pepito.nextLine();

        System.out.println("ingrese su apellido ");
        String apellido = pepito.nextLine();

        System.out.println("ingrese su nro de celular ");
        String numero = pepito.nextLine();

        System.out.println("ingrese su nacionalidad ");
        String nacionalidad = pepito.nextLine();

        System.out.println("ingrese su fecha de nacimiento ");
        String nacimiento = pepito.nextLine();

        System.out.println("ingrese su edad ");
        String edad = pepito.nextLine();

        //System.out.println(nombre + " " +apellido+ " " +numero + " "+ nacionalidad + " "+nacimiento +" "+edad);

        System.out.println("*****************************");
        System.out.println("Sus datos son: ");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido : "+apellido);
        System.out.println("Celular : "+numero);
        System.out.println("Nacionalidad : "+nacionalidad);
        System.out.println("Fecha de nacimiento : "+nacimiento);
        System.out.println("Edad : "+edad);
        System.out.println("*****************************");

        System.out.println("Hola me llamo "+nombre+" y mi apelllido es "+apellido);


    }//fin de main

}
