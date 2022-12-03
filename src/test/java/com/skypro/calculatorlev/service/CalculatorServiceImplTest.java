package com.skypro.calculatorlev.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.skypro.calculatorlev.constants.CalculatorServiceImplTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void fivePlusFive() {
        Integer result = calculatorService.plus(NUMBER_1, NUMBER_1);
        Assertions.assertEquals(EXPECTED_RESULT_1, result);
    }

    @Test
    public void fiftyFivePlusFive() {
        Integer result = calculatorService.plus(NUMBER_2, NUMBER_1);
        Assertions.assertEquals(EXPECTED_RESULT_2, result);
    }

    @Test
    public void fiveMinusFive() {
        int result = calculatorService.minus(NUMBER_1, NUMBER_1);
        Assertions.assertEquals(EXPECTED_RESULT_3, result);
    }

    @Test
    public void fiftyFiveMinusFive() {
        int result = calculatorService.minus(NUMBER_2, NUMBER_1);
        Assertions.assertEquals(EXPECTED_RESULT_4, result);
    }

    @Test
    public void fiveMultiplyFive() {
        int result = calculatorService.multiply(NUMBER_1, NUMBER_1);
        Assertions.assertEquals(EXPECTED_RESULT_5, result);
    }

    @Test
    public void fifteenMultiplyFive() {
        int result = calculatorService.multiply(NUMBER_3, NUMBER_1);
        Assertions.assertEquals(EXPECTED_RESULT_6, result);
    }

    @Test
    public void fiveDivideFive() {
        Double result = calculatorService.divide(NUMBER_4, NUMBER_4);
        Assertions.assertEquals(EXPECTED_RESULT_7, result);
    }

    @Test
    public void fifteenDivideTwo() {
        Double result = calculatorService.divide(NUMBER_5, NUMBER_6);
        Assertions.assertEquals(EXPECTED_RESULT_8, result);
    }
}