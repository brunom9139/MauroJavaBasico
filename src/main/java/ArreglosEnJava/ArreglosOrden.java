package ArreglosEnJava;

public class ArreglosOrden {
    public static void main(String[] args) {

        int[] numero = new int[10];
        int[] a = new int[10];

        for (int i = 0; i < numero.length; i++){
            numero[i] = i + 1;
        }

        int aux = 0;
        for (int i = 0; i < numero.length - i; i++){
            a[aux++] = numero[i];
            a[aux++] = numero[numero.length - 1 - i];
        }

        for (int i = 0; i < a.length; i++){
            System.out.println("i = " + i + " valor " + a[i]);
        }
    }
}
