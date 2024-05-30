package ArreglosEnJava;

import java.util.Arrays;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {

        String[] productos = {"Lavarropas ", "TV lcd 50p ", "Estufa ", "secarropas ", "Cocina ", "Heladera ", "Cama"};

        int total = productos.length;

        int contador = 0;

        for (int i = 0; i < total; i++){
            for (int j = 0; j < total; j++){
                if (productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;}
                }
            contador++;
            }
        System.out.println("contador = " + contador);

        System.out.println("###### Usando for #######");

        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + ":" + productos[i]);
        }
        }
    }

