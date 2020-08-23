package com.tutorial.thymeleafcourse.controllers;

import com.tutorial.thymeleafcourse.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final ProductService productService;

    public IndexController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping({"", "/"})
    public String getIndex(Model model) {
        model.addAttribute("products", productService.listProducts());
        return "index";
    }
}
