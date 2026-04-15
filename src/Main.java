import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        CalculadoraBasica calc = new CalculadoraBasica();

        do {
            System.out.println("\n--- Calculadora Científica ---");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Operaciones aritméticas");
            System.out.println("2. Ecuación cuadrática");
            System.out.println("3. Figuras geométricas");
            System.out.println("4. Sistema ecuaciones lineales");
            System.out.println("5. Ecuación de la recta");
            System.out.println("6. Salir");
            System.out.print("Su opción es: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("\n>> --- Operaciones Aritméticas ---");
                        double num1 = EntradaDatos.pedirnumero(scanner, "Ingresa el primer número: ");
                        double num2 = EntradaDatos.pedirnumero(scanner, "Ingresa el segundo número: ");

                        System.out.println("Suma: " + calc.sumar(num1, num2));
                        System.out.println("Resta: " + calc.restar(num1, num2));
                        System.out.println("Multiplicación: " + calc.multiplicar(num1, num2));
                        System.out.println("Mayor: " + calc.mayor(num1, num2));
                        System.out.println("Menor: " + calc.menor(num1, num2));

                        try {
                            System.out.println("División: " + calc.dividir(num1, num2));
                        } catch (ArithmeticException e) {
                            System.out.println("[ERROR DIVISIÓN] " + e.getMessage());
                        }

                        try {
                            System.out.println("Potencia: " + calc.potencia(num1, num2));
                        } catch (Exception e) {
                            System.out.println("[ERROR POTENCIA] " + e.getMessage());
                        }
                        break;

                    case 2:
                        System.out.println("\n>> --- Ecuación Cuadrática ---");
                        System.out.println("Resolviendo formato: Ax^2 + Bx + C = 0");

                        double a = EntradaDatos.pedirnumero(scanner, "Ingresa el valor de A: ");
                        double b = EntradaDatos.pedirnumero(scanner, "Ingresa el valor de B: ");
                        double c = EntradaDatos.pedirnumero(scanner, "Ingresa el valor de C: ");
                        EcuacionCuadratica ec = new EcuacionCuadratica();
                        ec.calcularRaices(a, b, c);

                        break;

                    case 3:
                        System.out.println("\n>> Iniciando Figuras geométricas...");
                        System.out.println("Funcionalidad en desarrollo...");
                        break;

                    case 4:
                        System.out.println("\n>> Iniciando Sistema ecuaciones lineales...");
                        System.out.println("Funcionalidad en desarrollo...");
                        break;

                    case 5:
                        System.out.println("\n>> Iniciando Ecuación de la recta...");
                        System.out.println("Funcionalidad en desarrollo...");
                        break;

                    case 6:
                        System.out.println("\nSaliendo de la calculadora. ¡Hasta pronto!");
                        break;

                    default:
                        System.out.println("\nOpción inválida. Por favor, ingrese un número del 1 al 6.");
                }
            } else {
                System.out.println("\nError: Debe ingresar un número válido para el menú.");
                scanner.next();
            }

        } while (opcion != 6);

        scanner.close();
    }
}