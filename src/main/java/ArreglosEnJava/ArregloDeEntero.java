package ArreglosEnJava;

public class ArregloDeEntero {
    public static void main(String[] args) {

        int[] numeros = new int[4];

        numeros [0] = 34;
        numeros [1] = 87;
        numeros [2] = 45;
        numeros [3] = -2;


        int i = numeros [0];
        int a = numeros [1];
        int s = numeros [2];
        int d = numeros [numeros.length - 1];

        System.out.println("i = " + i);
        System.out.println("a = " + a);
        System.out.println("s = " + s);
        System.out.println("d = " + d);
    }
}
