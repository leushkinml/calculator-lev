package com.skypro.calculatorlev.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();


    @Test
    public void fivePlusFive() {
        Integer result = calculatorService.plus(5, 5);
        Assertions.assertEquals(10, result);
    }

    @Test
    public void fiftyFivePlusFive() {
        Integer result = calculatorService.plus(55, 5);
        Assertions.assertEquals(60, result);
    }

    @Test
    public void fiveMinusFive() {
        int result = calculatorService.minus(5, 5);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void fiftyFiveMinusFive() {
        int result = calculatorService.minus(55, 5);
        Assertions.assertEquals(50, result);
    }

    @Test
    public void fiveMultiplyFive() {
        int result = calculatorService.multiply(5, 5);
        Assertions.assertEquals(25, result);
    }

    @Test
    public void fifteenMultiplyFive() {
        int result = calculatorService.multiply(15, 5);
        Assertions.assertEquals(75, result);
    }

    @Test
    public void fiveDivideFive() {
        Double result = calculatorService.divide(5.0, 5.0);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void fifteenDivideTwo() {
        Double result = calculatorService.divide(15.0, 2.0);
        Assertions.assertEquals(7.5, result);
    }
}