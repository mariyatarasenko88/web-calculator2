package pro.sky.webcalculator2.service;

import org.springframework.stereotype.Service;
import pro.sky.webcalculator2.exception.DivideByNullException;

@Service
public class CalculatorServiceImpl implements  CalculatorService {
    @Override
    public String printPlus(Integer a, Integer b) {
        checkNum(a, b);
        return a + " + " + b + " = " + (a + b);
    }
    @Override
    public String printMinus(Integer a, Integer b) {
        checkNum(a, b);
        return  a + " - " + b + " = " + (a - b);
    }
    @Override
    public String printMultiply(Integer a, Integer b) {
        checkNum(a, b);
        return a + " * " + b + " = " + (a * b);
    }
    @Override
    public String printDivide(Integer a, Integer b) {
        checkNum(a, b);
        if (b == 0) {
            throw new DivideByNullException("Делить на ноль нельзя");
        }
        return  a + " / " + b + " = " + (a / b);
    }
    private void checkNum(Integer a, Integer b) {
        if (a == null) {
            throw new RuntimeException("Параметр num1 не передан");
        }
        if (b == null) {
            throw new RuntimeException("Параметр num2 не передан");
        }
    }

}
