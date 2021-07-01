package com.example.demo.controller;

import com.example.demo.entity.ProductEntity;
import com.example.demo.model.BaseResponse;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public BaseResponse getProduct(@RequestParam Map<String, String> params){
        BaseResponse res = new BaseResponse();
        res.data = productService.getAllProduct();
        return res;
    }

    @PostMapping
    public BaseResponse addProduct(@RequestBody ProductEntity p){
        BaseResponse res = new BaseResponse();
        res.data = productService.addProduct(p);
        return res;
    }
}
