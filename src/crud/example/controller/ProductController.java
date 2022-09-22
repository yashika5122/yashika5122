package com.crud.example.controller;

import com.crud.example.entity.Product;
import com.crud.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public Product addProduct(@RequestBody Product product){
       return productService.saveProduct(product);
    }

    @PostMapping("/saveAll")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return productService.saveAllProduct(products);
    }

    @GetMapping("/products")
    public List<Product> findProduct(){
        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product findProductById(@PathVariable int id){
        return productService.getProductById(id);
    }
    @GetMapping("/products/{name}")
    public Product findProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }
}
