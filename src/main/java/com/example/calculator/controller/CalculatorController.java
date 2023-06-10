package com.example.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;

@Controller
public class CalculatorController {

    @RequestMapping("/home")
    public String goHome() {

        return "home";
    }

    @PostMapping("save")
    public String saveCondiments(@RequestParam String[] condiments, RedirectAttributes redirectAttributes) {
        System.out.println(Arrays.toString(condiments));
        redirectAttributes.addFlashAttribute("condiments", condiments);
        return "redirect:/bill";
    }
    @GetMapping("bill")
    public String showBill() {

        return "bill";
    }
}
