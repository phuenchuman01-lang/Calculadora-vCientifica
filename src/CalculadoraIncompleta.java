public class CalculadoraIncompleta {

    public static double dividir(double dividendo, double divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Error aritmetico : No es posible dividir por 0");
        }
        return dividendo/divisor;
    }

    public static double calcularpotencia(double base, double exponente) throws ArithmeticException {
        if (exponente == 0 && base == 0) {
            throw new ArithmeticException("Error aritmetico : La base y el exponente no pueden ser 0 al mismo tiempo");
        }
        return Math.pow(base, exponente);
    }
}
