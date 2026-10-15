/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import java.util.ArrayList;
import java.util.List;
import models.Order;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 *
 * @author DELL
 */
public class OrderData {
    public static Map<String, List<Order>> orderMap = new LinkedHashMap<>();
    
    public static void addOrder(String customerPhone, Order order) {
        List<Order> orders = orderMap.getOrDefault(customerPhone, new ArrayList<>());
        orders.add(order);
        orderMap.put(customerPhone, orders);
    }

    public static List<Order> getOrders(String customerPhone) {
        return orderMap.getOrDefault(customerPhone, new ArrayList<>());
    }
}
