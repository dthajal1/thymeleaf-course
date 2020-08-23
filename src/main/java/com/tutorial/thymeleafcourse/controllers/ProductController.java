package com.tutorial.thymeleafcourse.controllers;

import com.tutorial.thymeleafcourse.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public String getProduct() {
        return "redirect:/index";
    }

    @GetMapping("/product/{id}")
    public String getProductById(@PathVariable String id, Model model) {

        model.addAttribute("product", productService.getProductById(Integer.valueOf(id)));
        return "product";
    }


}
