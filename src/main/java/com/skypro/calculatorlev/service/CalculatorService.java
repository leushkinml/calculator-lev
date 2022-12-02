package com.skypro.calculatorlev.service;

import org.springframework.stereotype.Service;

public interface CalculatorService {
    Integer plus(Integer num1, Integer num2);
    Integer minus(Integer num1, Integer num2);
    Integer multiply(Integer num1, Integer num2);
    Double divide(Double num1, Double num2);
}
