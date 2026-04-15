import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatos {

    public static double pedirnumero(Scanner sc, String mensaje) {
        double numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(mensaje);
                numero = sc.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("\n[Error] Entrada inválida. Por favor, ingrese solo números.");
                sc.next();
            }
        }
        return numero;
    }
}