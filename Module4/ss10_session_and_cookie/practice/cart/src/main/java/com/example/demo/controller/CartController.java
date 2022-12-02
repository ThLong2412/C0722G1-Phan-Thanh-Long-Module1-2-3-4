package com.example.demo.controller;

import com.example.demo.model.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@RequestMapping("/cart")
public class CartController {

    @GetMapping("")
    public String showCart(@SessionAttribute("cart")Cart cart, Model model) {
        model.addAttribute("cart", cart);
        model.addAttribute("total", cart.countTotalPayment());
        return "/cart";
    }
}
