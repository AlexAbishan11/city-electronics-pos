/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author DELL
 */
public class Product {
     public String name;
    public String category;
    public double price;
    public String imagePath;
    public int quantity;

    // Constructor with all parameters
    public Product(String name, String category, double price, String imagePath, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.imagePath = imagePath;
        this.quantity = quantity;
    }

    // Default constructor
    public Product() {
    }

    public Product(String name, String category, int i, String imagePath) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getImagePath() {
        return imagePath;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + " - " + category + " - Rs. " + price;
    }
}