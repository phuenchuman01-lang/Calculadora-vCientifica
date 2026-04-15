import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraBasicaTest {
    CalculadoraBasica calc = new CalculadoraBasica();

    @Test
    void testSumar() {
        assertEquals(10, calc.sumar(7, 3));      // Test 1: Positivos
        assertEquals(-5, calc.sumar(-2, -3));    // Test 2: Negativos
    }

    @Test
    void testDividir() {
        assertEquals(5, calc.dividir(10, 2));    // Test 1: Normal
        assertEquals(2.5, calc.dividir(5, 2));   // Test 2: Con decimales
    }

    @Test
    void testMayor() {
        assertEquals(50, calc.mayor(50, 10));    // Test 1
        assertEquals(0, calc.mayor(-5, 0));      // Test 2
    }

    @Test
    void testPotencia() throws Exception {
        assertEquals(8, calc.potencia(2, 3));    // Test 1: 2 al cubo
        assertEquals(1, calc.potencia(100, 0));  // Test 2: Todo num a la 0 es 1
    }

    @Test
    void testPorcentaje() {
        assertEquals(20, calc.porcentaje(200, 10)); // Test 1: 10% de 200
        assertEquals(0, calc.porcentaje(50, 0));     // Test 2: 0% de algo
    }
}