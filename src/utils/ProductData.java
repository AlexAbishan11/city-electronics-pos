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
public class ProductData {
  public static List<models.Product> productList = new ArrayList<>();

    static {
        // Load sample data only once
        productList.addAll(SampleData.getProducts());
    }
}
