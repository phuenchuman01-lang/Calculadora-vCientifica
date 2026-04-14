public class CalculadoraBasica {

    public double sumar(double a, double b) { return a + b; }

    public double restar(double a, double b) { return a - b; }

    public double multiplicar(double a, double b) { return a * b; }

    public double dividir(double a, double b) { return a / b; }

    public double mayor(double a, double b) { return Math.max(a, b); }

    public double menor(double a, double b) { return Math.min(a, b); }

    public double potencia(double base, double exponente) { return Math.pow(base, exponente); }

    public double porcentaje(double numero, double tasa) { return (numero * tasa) / 100; }
}