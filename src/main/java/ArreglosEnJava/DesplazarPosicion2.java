package ArreglosEnJava;

import java.util.Scanner;

public class DesplazarPosicion2 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int elemento, posicion;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length -1; i++){
            System.out.print("Ingrese el numero");
            a[i] = s.nextInt();
        }

        System.out.println();

        System.out.println("Ingrese el nuevo elemento");
        elemento = s.nextInt();

        System.out.println("Ingrese la nueva posicion (de 0 a 9)");
        posicion = s.nextInt();

        for (int i = a.length - 2; i >= posicion; i--){
            a[i+1] = a[i];
        }
        a[posicion] = elemento;

        System.out.println("El arreglo ");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }


    }
}
