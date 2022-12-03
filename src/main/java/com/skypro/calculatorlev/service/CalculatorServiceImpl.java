package com.skypro.calculatorlev.service;

import com.skypro.calculatorlev.exception.IllegalNumberException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements com.skypro.calculatorlev.service.CalculatorService {
    @Override
    public Integer plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Введите параметры");
        }
        return num1+num2;
    }
    @Override
    public Integer minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Введите параметры");
        }
        return num1-num2;
    }
    @Override
    public Integer multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Введите параметры");
        }
        return num1 * num2;
    }
    @Override
    public Double divide(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Введите параметры");
        }
        if (num2 == 0) {
            throw new IllegalNumberException("На ноль делить нельзя, к сожалению.");
        }
        return num1/num2;
    }

}