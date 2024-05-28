package FlujosDeControl;

import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombre = {"Mauro", "Pepito", "Maria", "Pedrito", "Ramoncito", "for", "charly", "davy"};
        int count = nombre.length;
        for (int i = 0; i < count; i++){
            if(nombre[i].toLowerCase().contains("Mauro".toLowerCase()) ||
                    nombre[i].toLowerCase().contains("Pepito".toLowerCase())){
                continue;
            }
            System.out.println( i + ".= " + nombre[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre ejemplo \"Mauro\" o \"Maria\":");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if (nombre[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " Fue encontrado!");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " Fue encontrado!");
        }
    }
}
