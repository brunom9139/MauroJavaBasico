package org.example.Cadenas;

public class StringComparar {
    public static void main(String[] args) {
        String str1 = "pepito";
        String str2 = new String("pepito");

        boolean esIgual = str1 == str2 ;
        System.out.println("son el mismo valor? "+ esIgual);

        esIgual = str1.equals(str2);
        System.out.println("son el mismo valor? "+ esIgual);

        String str3 = "pepito";
        esIgual = str3 == str1;
        System.out.println("son el mismo valor? "+ esIgual);
    }
}
