package com.skypro.calculatorlev.service;


import com.skypro.calculatorlev.exception.IllegalNumberException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;
// Статические импорты. В тестах использовать можно, в основном коде не рекомендуется
import static org.junit.jupiter.api.Assertions.*; // - вынесли из методов для упрощения кода
import static org.junit.jupiter.params.provider.Arguments.*;// - вынесли из методов для упрощения кода

public class CalculatorServiceImplParameterizedTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("plusList")
    public void plusTest(Integer num1, Integer num2, Integer result) {
        assertEquals(result, calculatorService.plus(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("minusList")
    public void minusTest(int num1, int num2, int result) {
        assertEquals(result, calculatorService.minus(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("multiplyList")
    public void multiplyTest(int num1, int num2, int result) {
        assertEquals(result, calculatorService.multiply(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("divideList")
    public void divideTest(Double num1, Double num2, Double result) {
        assertEquals(result, calculatorService.divide(num1, num2));
    }
    @Test
    public void zeroDividingException() {
        assertThrows(IllegalNumberException.class, () -> {
            calculatorService.divide(1.0, 0.0);
        });
    }
    public static List<Arguments> plusList() {  // Можно писать Списками, можно писать Стримами.
        return List.of(
                of(5,5,10),
                of(55,5,60),
                of(55,-110,-55)
        );
    }
    public static List<Arguments> minusList() {
        return List.of(
                of(5,5,0),
                of(55,5,50),
                of(55,-55,110)
        );
    }
    public static List<Arguments> multiplyList() {
        return List.of(
                of(5,5,25),
                of(15,5,75),
                of(15,-5,-75)
        );
    }
    // Можно писать Списками, можно писать Стримами.
    public static Stream<Arguments> divideList() {
        return Stream.of(
                of(5,5,1),
                of(15,2,7.5),
                of(15,-5,-3)
        );
    }
}
