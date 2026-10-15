/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author DELL
 */
public class Order {
    public String customerPhone;
    public List<Product> productList;
    public double totalAmount;
    public String status;

    public Order(String customerPhone, List<Product> productList, double totalAmount, String status) {
        this.customerPhone = customerPhone;
        this.productList = productList;
        this.totalAmount = totalAmount;
        this.status = status;
    }
}
