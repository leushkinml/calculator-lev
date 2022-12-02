package com.skypro.calculatorlev.controller;

import com.skypro.calculatorlev.exception.IllegalNumberException;
import com.skypro.calculatorlev.service.CalculatorService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @ExceptionHandler(value = IllegalNumberException.class)
    public ResponseEntity<String> illegalNumberHandler(IllegalNumberException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @GetMapping("")
    public String greetings() {
        return "Добро пожаловать в калькулятор.";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        Integer result = calculatorService.plus(num1, num2);
        return String.format("%d + %d = %d", num1, num2, result);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        Integer result = calculatorService.minus(num1, num2);
        return String.format("%d - %d = %d", num1, num2, result);
    }

    @GetMapping("/multiply")
    private String multiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        Integer result = calculatorService.multiply(num1, num2);
        return String.format("%d * %d = %d", num1, num2, result);
    }

    @GetMapping("/divide")
    private String divide(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        Double result = calculatorService.divide(num1, num2);
        return String.format("%d / %d = %d", num1, num2, result);
    }
}
