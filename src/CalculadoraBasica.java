public class CalculadoraBasica {

    public double sumar(double a, double b) { return a + b; }

    public double restar(double a, double b) { return a - b; }

    public double multiplicar(double a, double b) { return a * b; }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero");
            return 0; // O lanzar una excepción
        }
        return a / b;
    }

    public double mayor(double a, double b) { return Math.max(a, b); }

    public double menor(double a, double b) { return Math.min(a, b); }

    public double potencia(double base, double exponente) throws Exception {
        if (base == 0 && exponente == 0) {
            throw new Exception("Error aritmetico : La base y el exponente no pueden ser 0 al mismo tiempo");
        }
        return Math.pow(base, exponente);
    }

    public double porcentaje(double numero, double tasa) { return (numero * tasa) / 100; }
}