/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Cart {
    private static Map<String, List<CartItem>> cartMap = new HashMap<>();

    public static void addItem(String phone, CartItem item) {
        List<CartItem> items = cartMap.getOrDefault(phone, new ArrayList<>());
        items.add(item);
        cartMap.put(phone, items);
    }

    public static List<CartItem> getItems(String phone) {
        return cartMap.getOrDefault(phone, new ArrayList<>());
    }

    public static void clearCart(String phone) {
        cartMap.remove(phone);
    }
}