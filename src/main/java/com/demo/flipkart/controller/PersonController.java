package com.demo.flipkart.controller;

import com.demo.flipkart.dao.PersonForm;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class PersonController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/person")
    public String showForm(PersonForm personForm) {
        return "form";
    }

    @PostMapping("/person")
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "form";
        }

        return "redirect:/results";
    }

}
