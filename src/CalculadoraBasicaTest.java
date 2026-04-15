import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraBasicaTest {

    CalculadoraBasica calc = new CalculadoraBasica();

    @Test
    public void testDividirPorCero() {
        // Corrobora que si el divisor es 0, retorne 0.0 según tu lógica actual
        assertEquals(0.0, calc.dividir(10, 0), "Debería retornar 0 al dividir por cero");
    }

    @Test
    public void testPotenciaNormal() throws Exception {
        // Como el método lanza una excepción, el test también debe declararlo o usar try-catch
        assertEquals(8.0, calc.potencia(2, 3), 0.001);
    }

    @Test
    public void testPotenciaCeroCero() {
        Exception exception = assertThrows(Exception.class, () -> {
            calc.potencia(0, 0);
        });
        String mensajeEsperado = "Error aritmetico";
        assertTrue(exception.getMessage().contains(mensajeEsperado));
    }

    @Test
    public void testPorcentaje() {
        assertEquals(15.0, calc.porcentaje(100, 15), 0.001);
    }
}