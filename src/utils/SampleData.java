/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import models.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class SampleData {
    public static List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        
        // Communication
        products.add(new Product("samsung galaxy m16 5g", "Communication", 75000, "images/mobile1.jpg", 10));
        products.add(new Product("i phone 13", "Communication", 100000, "images/mobile4.jpg", 15));
        products.add(new Product("one plus", "Communication", 65000, "images/mobile3.jpg", 8));
        products.add(new Product("dell", "Communication", 100000, "images/laptop1.jpg", 5));
        products.add(new Product("asus", "Communication", 58000, "images/laptop2.jpg", 7));
        products.add(new Product("lenovo", "Communication", 52000, "images/laptop3.jpg", 12));
        
        // Computer Accessories
        products.add(new Product("RGB Keyboard", "Computer Accessories", 2000, "images/keyboard1.jpg", 10));
        products.add(new Product("wireless Keyboard", "Computer Accessories", 1500, "images/keyboard2.jpg", 20));
        products.add(new Product("wired Mouse", "Computer Accessories", 750, "images/mouse.jpg", 25));
        products.add(new Product("RGB wired Mouse", "Computer Accessories", 690, "images/mouse2.jpg", 18));
        products.add(new Product("sony Pendrive", "Computer Accessories", 1200, "images/pendrive.jpg", 30));
        products.add(new Product("Hard Disk", "Computer Accessories", 3000, "images/hard_disk1.jpg", 15));
        
        // TV & Audio
        products.add(new Product("LG TV", "TV & Audio", 55000, "images/tv1.jpg", 6));
        products.add(new Product("panasonic TV", "TV & Audio", 36000, "images/tv2.jpg", 9));
        products.add(new Product("samsung monitor", "TV & Audio", 30000, "images/tv3.jpg", 7));
        products.add(new Product("bluetooth Speaker", "TV & Audio", 4650, "images/speaker1.jpg", 14));
        products.add(new Product("den-b Speaker", "TV & Audio", 11000, "images/speaker2.jpg", 11));
        products.add(new Product("LG Speaker", "TV & Audio", 16799, "images/speaker3.jpg", 10));
        
        return products;
    }
}