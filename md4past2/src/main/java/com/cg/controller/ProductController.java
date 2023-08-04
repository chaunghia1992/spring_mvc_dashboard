package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("products")
    public String showListPage() {
        return "/product/list";
    }


    @GetMapping("products/create")
    public String showCreatePage() {
        return "/product/create";
    }
}