package org.example.Operadores;

import java.util.Scanner;

public class LoginTernario {
    public static void main(String[] args) {

        String[]username = {"andres", "pepito", "mauro"};
        String[]password = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre de usuario ");
        String u = scanner.next();

        System.out.println("Ingrese su Contraseña ");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < username.length; i++){
            esAutenticado = (username[i].equals(u) && password[i].equals(p))? true: esAutenticado;
        }

        String mensaje = esAutenticado ? "Bienvenido Usuario ".concat(u).concat("!"):
                "Username o Contraseña incorrecto\nLo sentimos, requiere autenticacion ";
        System.out.println("mensaje = " + mensaje);

    }
}
