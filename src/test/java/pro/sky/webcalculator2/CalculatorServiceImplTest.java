package pro.sky.webcalculator2;

import org.junit.jupiter.api.Test;
import pro.sky.webcalculator2.exception.DivideByNullException;
import pro.sky.webcalculator2.service.CalculatorService;
import pro.sky.webcalculator2.service.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceImplTest {
    private final CalculatorService service = new CalculatorServiceImpl();

    @Test
    public void when5plus5equals10_thenSucceeds() {
        Integer a = 5;
        Integer b = 5;
        String expected = service.printPlus(a, b);
        String actual = "5 + 5 = 10";
        assertEquals(expected, actual);
    }
    @Test
    public void when5minus5equals0_thenSucceeds() {
        Integer a = 5;
        Integer b = 5;
        String expected = service.printMinus(a, b);
        String actual = "5 - 5 = 0";
        assertEquals(expected, actual);
    }
    @Test
    public void when5multiply5equals25_thenSucceeds() {
        Integer a = 5;
        Integer b = 5;
        String expected = service.printMultiply(a, b);
        String actual = "5 * 5 = 25";
        assertEquals(expected, actual);
    }
    @Test
    public void when5divide5equals1_thenSucceeds() {
        Integer a = 5;
        Integer b = 5;
        String expected = service.printDivide(a, b);
        String actual = "5 / 5 = 1";
        assertEquals(expected, actual);
    }
    @Test
    public void when5divide0throwException_thenSucceeds() {
        Integer a = 5;
        Integer b = 0;
        Exception exception = assertThrows(DivideByNullException.class, () -> service.printDivide(a, b));
        String expected = "Делить на ноль нельзя";
        String actual = exception.getMessage();
        assertTrue(actual.contains(expected));
    }

}
