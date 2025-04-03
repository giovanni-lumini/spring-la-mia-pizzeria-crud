package org.exercise.spring.spring_pizzeria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/pizze")
public class PizzeController {
    @GetMapping
    public String index() {
        return "pizze/index";
    }
}
