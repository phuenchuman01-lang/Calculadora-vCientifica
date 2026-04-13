import java.util.Scanner;


public class TestMain {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Prueba de Excepciones");

        double num1 = EntradaDatos.pedirnumero(sc, "Ingresa el primer número: ");
        double num2 = EntradaDatos.pedirnumero(sc, "Ingresa el segundo número: ");

        try {
            System.out.println("\nDividiendo...");
            double resultadoDiv = CalculadoraTest.dividir(num1, num2);
            System.out.println("Resultado: " + resultadoDiv);
        } catch (ArithmeticException e) {
            System.out.println("[ERROR CAPTURADO] " + e.getMessage());
        }

        try {
            System.out.println("\nCalculando potencia...");
            double resultadoPot = CalculadoraTest.calcularpotencia(num1, num2);
            System.out.println("Resultado: " + resultadoPot);
        } catch (Exception e) {
            System.out.println("[ERROR CAPTURADO] " + e.getMessage());
        }

        sc.close();
    }
}
