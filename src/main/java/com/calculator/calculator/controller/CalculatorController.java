package com.calculator.calculator.controller;

import com.calculator.calculator.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    Calculator calculator = new Calculator();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greeting(@RequestParam(value="value1", required=false)  String value1,
                           @RequestParam(value = "value2", required = false) String value2,
                           @RequestParam(value = "operation", required = false) String operation,
                           Model model) {
        if (value1 != null && value2 != null && operation != null) {
            switch (operation) {
                case "sum" :
                    model.addAttribute("result", calculator.sum(Double.parseDouble(value1), Double.parseDouble(value2)));
                    break;
                case "sub" :
                    model.addAttribute("result", calculator.sub(Double.parseDouble(value1), Double.parseDouble(value2)));
                    break;
                case "div" :
                    model.addAttribute("result", calculator.div(Double.parseDouble(value1), Double.parseDouble(value2)));
                    break;
                case "mul" :
                    model.addAttribute("result", calculator.mul(Double.parseDouble(value1), Double.parseDouble(value2)));
                    break;
                default:
                    break;
            }
        }
        return "index";
    }
}
