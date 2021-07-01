package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping({"/", "index"})
    private String index() {
        return "index";
    }

    @GetMapping({"/addProduct"})
    private String addProduct(){
        return "addProduct";
    }
}
