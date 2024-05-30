package ArreglosEnJava;

import java.util.Arrays;

public class IterandoInverso {
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
        System.out.println("###### Usando for inverso #######");
        for (int i = 0; i < total; i++){
            System.out.println("Para i = " + (total-1-i) + " valor:" + productos[total-1-i]);
        }
    }
}
