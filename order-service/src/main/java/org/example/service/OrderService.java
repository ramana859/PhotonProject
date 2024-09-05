package org.example.service;

import org.example.entity.Order;
import org.example.exceptionhandling.ProductNotFoundException;
import org.example.feignclient.ProductClient;
import org.example.repository.OrderRepo;
import org.example.response.OrderResponse;
import org.example.response.ProductResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ProductClient productClient;

    public OrderResponse getOrderById(int id) {
        Optional<Order> order = orderRepo.findById(id);
        OrderResponse orderResponse = modelMapper.map(order, OrderResponse.class);

        ResponseEntity<ProductResponse> productResponse = productClient.getProductByOrderId(id);
        orderResponse.setProductResponse(productResponse.getBody());
        return orderResponse;
    }

}
