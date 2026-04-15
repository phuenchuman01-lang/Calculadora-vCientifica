public class EcuacionCuadratica {

    // Ahora devuelve un arreglo de decimales (double[])
    public double[] calcularRaices(double a, double b, double c) {
        if (a == 0) {
            System.out.println("[Error] Si 'A' es 0, no es una ecuación cuadrática.");
            return new double[]{}; // Devuelve vacío
        }

        double discriminante = Math.pow(b, 2) - (4 * a * c);
        System.out.println("\nEcuación: " + a + "x^2 + " + b + "x + " + c + " = 0");

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("x1 = " + x1 + " | x2 = " + x2);
            return new double[]{x1, x2}; // Devuelve las dos raíces

        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
            return new double[]{x}; // Devuelve una raíz

        } else {
            System.out.println("Las soluciones son números complejos (imaginarios).");
            return new double[]{}; // Devuelve vacío porque no son reales
        }
    }
}