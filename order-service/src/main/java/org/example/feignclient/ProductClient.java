package org.example.feignclient;

import org.example.response.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", url = "http://localhost:8081", path = "/product-service")
public interface ProductClient {
    @GetMapping("/product/{id}")
    public ResponseEntity<ProductResponse> getProductByOrderId(@PathVariable("id") int id);

}
