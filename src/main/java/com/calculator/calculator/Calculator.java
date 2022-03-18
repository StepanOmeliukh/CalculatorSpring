package com.calculator.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Calculator {

    Logger logger = LoggerFactory.getLogger(Calculator.class);

    public String sum(Double first, Double second) {
        double sum = first + second;
        logger.info("Sum, result: " + sum);
        return Double.toString(sum);
    }

    public String sub(Double first, Double second) {
        double sub = first - second;
        logger.info("Sub, result: " + sub);
        return Double.toString(sub);
    }

    public String div(Double first, Double second) {
        try {
            if (second == 0)
                throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            logger.error("Div, You can't divide on zero");
            return "You can't divide on zero";
        }

        double div = first / second;
        logger.info("Div, result: " + div);
        return Double.toString(div);
    }

    public String mul(Double first, Double second) {
        double mul = first * second;
        logger.info("Mul, result: " + mul);
        return Double.toString(mul);
    }
}
