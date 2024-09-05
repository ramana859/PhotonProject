package org.example.response;

import java.util.ArrayList;
import java.util.Date;

public class OrderResponse {

    private int id;
    private  String customerName;
//    private ArrayList<Integer> products;
    private int products;

    public void setProducts(int products) {
        this.products = products;
    }

    private Date orderDate;
    private ProductResponse productResponse;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

/*    public ArrayList<Integer> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Integer> products) {
        this.products = products;
    }*/

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public ProductResponse getProductResponse() {
        return productResponse;
    }

    public void setProductResponse(ProductResponse productResponse) {
        this.productResponse = productResponse;
    }

}
