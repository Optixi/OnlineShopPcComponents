package com.sda.onlineshop.componentspc.controller;

import com.sda.onlineshop.componentspc.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final ProductService productService;

    public HomeController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = {"/","/index","/home"})
    public String showIndexPage(Model model){
        model.addAttribute("products", productService.getAll());
        return "index";
    }
}