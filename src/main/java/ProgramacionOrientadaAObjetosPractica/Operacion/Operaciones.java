package ProgramacionOrientadaAObjetosPractica.Operacion;

import java.util.ArrayList;
import java.util.List;

public class Operaciones {

    private int numero1;
    private int numero2;

    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int sumar() {
        return numero1 + numero2;
    }

    public int restar() {
        return numero1 - numero2;
    }

    public int multiplicar() {
        return numero1 * numero2;
    }

    public int dividir() {
        return numero1 / numero2;
    }

    public int mayor() {
        if (numero1 >= numero2) {
            return numero1;
        } else {
            return numero2;
        }
    }

    public int menor() {
        if (numero1 <= numero2) {
            return numero1;
        } else {
            return numero2;
        }
    }

    public boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String analizarPar(int numero) {
        if (numero <= 0) {
            return "El numero ingresado " + numero + " es negativo";
        } else if (numero % 2 == 0) {
            return "El numero ingresado " + numero + " es par";
        } else {
            return "El numero ingresado " + numero + " es impar";
        }
    }

    public String tabla(int numero) {
        String resultado = "";
        for (int i = 0; i <= 10; i++) {
            resultado += numero + " * " + i + " = " + (numero * i) + "\n";
        }
        return resultado;
    }

    public List<Integer> numeroPar(int numero) {
        List<Integer> numerosPar = new ArrayList<>();
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                numerosPar.add(i);
            }
        }
        return numerosPar;
    }

}
