package org.example.controller;


import org.example.response.ProductResponse;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/{orderId}")
    public ResponseEntity<ProductResponse> getProductByOrderId(@PathVariable("orderId") int orderId){
        ProductResponse productResponse = productService.findProductByOrderId(orderId);
        return ResponseEntity.status(HttpStatus.OK).body(productResponse);
    }

    @GetMapping("/products")
    public ResponseEntity<ProductResponse> getAllProducts(){
        ProductResponse allProductResponse = productService.findAllProducts();
        return ResponseEntity.status(HttpStatus.OK).body(allProductResponse);
    }
}
