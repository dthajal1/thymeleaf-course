package com.tutorial.thymeleafcourse.controllers;

import com.tutorial.thymeleafcourse.commands.CheckoutCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CheckoutController {

    @GetMapping("/checkout")
    public String checkoutForm(Model model) {
        model.addAttribute("checkoutCommand", new CheckoutCommand());
        return "checkoutform";
    }

    @PostMapping("/docheckout")
    public String doCheckOut(@ModelAttribute @Valid CheckoutCommand checkoutCommand, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "checkoutform";
        }
        return "checkoutcomplete";

    }
}
