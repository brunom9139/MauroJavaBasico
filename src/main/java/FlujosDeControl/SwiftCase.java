package FlujosDeControl;

public class SwiftCase {
    public static void main(String[] args) {

        char num = 'a';

        switch (num ){
            case '0':
                System.out.println("El nro es 0 ");
                break;
            case '1':
                System.out.println("El nro es 1 ");
                break;
            case '2':
                System.out.println("El nro es 2 ");
                break;
            case '3':
                System.out.println("El nro es 3 ");
                break;
            case 'a':
                System.out.println("El nro es a ");
                break;
            default:
                System.out.println("Numero o Caracter desconocido!");
        }

            String nombre = "mauro";
             switch (nombre){

                 case "admin":
                     System.out.println("Hola admin, Bienvenido");
                     break;
                 case "mauro":
                     System.out.println("Hola mauro, Bienvenido");
                     break;
                 case "pepe":
                     System.out.println("Hola pepe, Bienvenido");
                     break;
                 default:
                     System.out.println("Usuario no Correcto");
             }


    }
}
