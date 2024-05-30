package ArreglosEnJava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IterandoArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = " Bicicleta zion";
        productos[1] = " Laptop asus";
        productos[2] = " Ram DDR4 kingston";
        productos[3] = " Monitor 25 pulgadas";
        productos[4] = " Cpu asus";
        productos[5] = " Tarjeta grafica intel";
        productos[6] = " Placa madre reforzada";

        Arrays.sort(productos);
        System.out.println("###### Usando for #######");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + ":" + productos[i]);
        }

        System.out.println("####### Usando foreach #######");
        for (String prod : productos) {
            System.out.println("prod = " + prod);
        }
        System.out.println("####### Usando while #######");
        int i = 0;
        while (i < total) {
            System.out.println("indice para " + i + ":" + productos[i]);
            i++;
        }
        System.out.println("####### Usando while Do #######");
        int j = 0;
        do {
            System.out.println("indice para " + j + ":" + productos[j]);
            j++;
        } while (j < total);

        System.out.println("############# Usando numerous ################");

        int[] numeros = new int[10];

        int totalNumeros = numeros.length;
        for (int k = 0; k < totalNumeros; k++) {
            numeros[k] = k * 3;
        }
        for (int k = 0; k < totalNumeros; k++) {
            System.out.println("numeros = " + numeros[k]);
        }
    }
}
