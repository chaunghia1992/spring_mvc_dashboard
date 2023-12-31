package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping()
    public String showListPage() {
        return "customer/list";
    }


    @GetMapping("/create")
    public String showCreatePage() {
        return "customer/create";
    }

}