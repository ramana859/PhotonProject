package org.example.service;

import org.example.entity.Product;
import org.example.repository.ProductRepo;
import org.example.response.ProductResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ModelMapper modelMapper;

    public ProductResponse findProductByOrderId(int orderId){
        Optional<Product> productByOrderId = productRepo.findProductByOrderId(orderId);
        System.out.println(productByOrderId);
        System.out.println(modelMapper.map(productByOrderId, ProductResponse.class));
        return modelMapper.map(productByOrderId, ProductResponse.class);
    }

    public ProductResponse findAllProducts(){
        List<Product> allProducts = productRepo.findAll();
        return modelMapper.map(allProducts, ProductResponse.class);
    }


}
