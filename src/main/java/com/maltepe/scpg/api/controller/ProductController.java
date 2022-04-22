package com.maltepe.scpg.api.controller;

import com.maltepe.scpg.business.abstracts.IProductService;
import com.maltepe.scpg.entities.concretes.Product;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("api/product")
@RequiredArgsConstructor
public class ProductController
{
    private final IProductService productService;


    @GetMapping("/getall")
    public List<Product> getAll()
    {
        return this.productService.getAll();
    }

    @GetMapping("/getbyid")
    public Product getById(@RequestParam int id)
    {
        return this.productService.getById(id);
    }

    @GetMapping("/getbyname")
    public List<Product> getByName(@RequestParam String name)
    {
        return this.productService.getByName(name);
    }

    @GetMapping("/getbynamecontains")
    public List<Product> getByNameContains(@RequestParam String name)
    {
        return this.productService.getByNameContains(name);
    }
}
