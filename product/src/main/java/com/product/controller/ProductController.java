package com.product.controller;

import com.product.model.Product;
import com.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/productController")

public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    public Product addProducts(@RequestBody Product product) {
        return productService.addProducts(product);
    }

    @GetMapping("/viewProducts")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PutMapping("/updateProduct/{id}")
    public Product updateProducts(@RequestBody Product product, @PathVariable("id") int productId) {
        return productService.updateProducts(product, productId);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProductsById(@PathVariable("id") int productId) {
        productService.deleteProductsById(productId);
    }

}
