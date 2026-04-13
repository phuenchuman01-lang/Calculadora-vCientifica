import java.util.InputMismatchException;
import java.util.Scanner;


public class EntradaDatos {

    public static double pedirnumero(Scanner sc, String mensaje){
        double numero = 0;
        boolean valido = false;

        while(!valido){
            try {
                System.out.print(mensaje);
                numero = sc.nextDouble();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error en formato: Se debe ingresar un numero valido ");
                sc.nextLine();
            }
        }
        return numero;
    }
}
