import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EcuacionCuadraticaTest {

    EcuacionCuadratica ec = new EcuacionCuadratica();

    @Test
    void testDosRaicesPositivas() {
        // Prueba 1: Ecuación x^2 + 5x + 4 = 0 (Las raíces deben ser -1 y -4)
        // Guardamos el resultado de la función en un arreglo
        double[] resultado = ec.calcularRaices(1, 5, 4);

        // Verificamos que tenga exactamente 2 respuestas
        assertEquals(2, resultado.length);

        // Verificamos que las respuestas sean correctas
        assertEquals(-1.0, resultado[0]);
        assertEquals(-4.0, resultado[1]);
    }

    @Test
    void testRaicesImaginarias() {
        // Prueba 2: Ecuación x^2 + x + 1 = 0 (No tiene raíces reales, debe devolver vacío)
        double[] resultado = ec.calcularRaices(1, 1, 1);

        // Verificamos que el arreglo esté vacío (longitud 0)
        assertEquals(0, resultado.length);
    }
}