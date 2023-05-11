package pro.sky.webcalculator2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.webcalculator2.service.CalculatorService;
import pro.sky.webcalculator2.service.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.webcalculator2.CalculatorServiceImplTestConstants.FIVE;

public class CalculatorServiceImplParametrizedTest {
    private final CalculatorService service = new CalculatorServiceImpl();
    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(Arguments.of(FIVE, FIVE));
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCorrectPlusNumbers(Integer a, Integer b) {
        String expected = service.printPlus(a, b);
        String actual = a + " + " + b + " = " + (a + b);
        assertEquals(actual, expected);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCorrectMinusNumbers(Integer a, Integer b) {
        String expected = service.printMinus(a, b);
        String actual = a + " - " + b + " = " + (a - b);
        assertEquals(actual, expected);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCorrectMultiplyNumbers(Integer a, Integer b) {
        String expected = service.printMultiply(a, b);
        String actual = a + " * " + b + " = " + (a * b);
        assertEquals(actual, expected);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCorrectDivideNumbers(Integer a, Integer b) {
        String expected = service.printDivide(a, b);
        String actual = a + " / " + b + " = " + (a / b);
        assertEquals(actual, expected);
    }

}
