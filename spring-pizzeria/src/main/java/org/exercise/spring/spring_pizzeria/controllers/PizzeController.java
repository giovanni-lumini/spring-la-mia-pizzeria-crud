package org.exercise.spring.spring_pizzeria.controllers;

import java.util.List;

import org.exercise.spring.spring_pizzeria.model.Pizze;
import org.exercise.spring.spring_pizzeria.repository.PizzeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/pizze")
public class PizzeController {

    @Autowired
    private PizzeRepository pizzeRepository;

    @GetMapping
    public String index(Model model) {
        List<Pizze> pizze = pizzeRepository.findAll();
        model.addAttribute("pizze", pizze);
        return "pizze/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") Integer id, Model model) {
        Pizze pizza = pizzeRepository.findById(id).get();
        model.addAttribute("pizza", pizza);
        return "pizze/show";
    }
}
