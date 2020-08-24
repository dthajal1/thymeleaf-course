package com.tutorial.thymeleafcourse.controllers;

import com.tutorial.thymeleafcourse.commands.CheckoutCommand;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CheckoutController {

    @GetMapping("/checkout")
    public String checkoutForm() {
        return "checkoutform";
    }

    @PostMapping("/docheckout")
    public String doCheckOut(@Valid CheckoutCommand checkoutCommand, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "checkoutform";
        } else {
            return "checkoutcomplete";
        }

    }
}