package org.example;

public class Main {
    public static void main(String[] args) {

        String nombre_persona = "Mauro";
        System.out.println("Hola " + nombre_persona);
        System.out.println("Hola " + nombre_persona.toLowerCase());
        System.out.println("Hola " + nombre_persona.toUpperCase());

        System.out.println("##########################################");

        int edad = 17;
        System.out.println(edad);
        System.out.println("Mi edad es " + edad);

        if (edad >= 18) { //23 >=18
            System.out.println("puede entrar ");
        } else {
            System.out.println("no puede entrar papa");
        }
        System.out.println("##########################################");


        boolean prendido = true;
        if (!prendido) {
            System.out.println("si esta prendido ");
        } else {
            System.out.println("no esta prendido ");
        }
        System.out.println("##########################################");

        int numero = 10;

        boolean valor = true;

        int numero2 = 5;

        if (valor) {
            System.out.println("numero = " + numero);
            System.out.println("numero2 = " + numero2);
            numero2 = 15;
            numero = 1;
            System.out.println("numero = " + numero);
        }

        if (numero2 == 15){
            System.out.println("numero2 si es 15: "+ numero2);
        } else{
            System.out.println("no es 15");
        }


    }
}