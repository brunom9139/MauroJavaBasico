package org.example;

import java.awt.geom.CubicCurve2D;

public class ConversionPrimitivo {
    public static void main(String[] args) {
        String realStr = "2144.24e-5";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("numero real es = "+ realDouble);

        String numeroInt = "12";
        int numeroDoble = Integer.parseInt(numeroInt);
        System.out.println("numero int es = " + numeroDoble);

        String verdaderoComoCadena = "yes";
        boolean verdadero = Boolean.parseBoolean(verdaderoComoCadena);
        System.out.println("este es = " + verdadero);

        String numeroAlto = "235423523523523";
        long numeroMuyAlto = Long.parseLong(numeroAlto);
        System.out.println("numeroMuyAlto = " + numeroMuyAlto);


        System.out.println("##########################################");


        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);



    }
}
