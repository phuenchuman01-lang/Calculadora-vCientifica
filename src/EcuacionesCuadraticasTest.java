import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EcuacionCuadraticaTest {

    EcuacionCuadratica ec = new EcuacionCuadratica();

    @Test
    void testDosRaicesPositivas() {
        double[] resultado = ec.calcularRaices(1, 5, 4);

        assertEquals(2, resultado.length);

        assertEquals(-1.0, resultado[0]);
        assertEquals(-4.0, resultado[1]);
    }

    @Test
    void testRaicesImaginarias() {
        double[] resultado = ec.calcularRaices(1, 1, 1);

        assertEquals(0, resultado.length);
    }
}
