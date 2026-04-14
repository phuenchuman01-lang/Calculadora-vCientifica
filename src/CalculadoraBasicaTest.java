import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraBasicaTest {
    CalculadoraBasica calc = new CalculadoraBasica();

    @Test
    void testPotencia() {
        assertEquals(8, calc.calcularPotencia(2, 3)); // Prueba 1
        assertEquals(1, calc.calcularPotencia(5, 0)); // Prueba 2
    }
}
