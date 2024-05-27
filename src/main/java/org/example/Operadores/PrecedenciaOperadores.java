package org.example.Operadores;

public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int a = 14;
        int s = 3;
        int d = 27;

        double promedio = (a + s + d) / 3d;
        System.out.println("promedio = " + promedio);

        promedio = (a + s + d) / 3d * 10;
        System.out.println("promedio = " + promedio);

        promedio = ++a + s-- + d / 3d * 10;
        System.out.println("promedio = " + promedio);
        System.out.println("a = " + a);
        System.out.println("s = " + s);


    }
}
