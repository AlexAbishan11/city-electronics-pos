/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer;
import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

import models.Cart;
import models.CartItem;
import models.Product;
import customer.ProductListUI;
/**
 *
 * @author DELL
 */
public class CartUI extends JFrame {

    private JPanel panelItems;
    private JLabel lblTotal;
    private String loggedInPhone;

    public CartUI(String loggedInPhone) {
       this.loggedInPhone = loggedInPhone;

        setTitle("Your Cart");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        panelItems = new JPanel();
        panelItems.setLayout(new BoxLayout(panelItems, BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane(panelItems);

        lblTotal = new JLabel("Total: Rs. 0.0");
        lblTotal.setFont(new Font("Arial", Font.BOLD, 16));
        lblTotal.setHorizontalAlignment(SwingConstants.CENTER);

        
        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(e -> {
           
           new ProductListUI("Communication", loggedInPhone).setVisible(true);
    this.dispose();
        });

        
        JButton btnBilling = new JButton("Proceed to Billing");
        btnBilling.addActionListener(e -> {
           List<CartItem> cartItems = Cart.getItems(loggedInPhone);
            List<Product> productList = new ArrayList<>();
            double totalAmount = 0.0;

            for (CartItem item : cartItems) {
                Product p = new Product();
                p.name = item.getName();
                p.price = item.getPrice();
                p.quantity = item.getQuantity();
                productList.add(p);
                totalAmount += item.getTotal();
            }

            new BillingUI(loggedInPhone, productList, totalAmount).setVisible(true);
            this.dispose();
        });

       
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(btnBack);
        bottomPanel.add(btnBilling);

        
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(new JLabel("Items in Your Cart", SwingConstants.CENTER), BorderLayout.NORTH);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(lblTotal, BorderLayout.SOUTH);
        getContentPane().add(bottomPanel, BorderLayout.PAGE_END);

        displayCartItems();
    }

    private void displayCartItems() {
        panelItems.removeAll();

        List<CartItem> items = Cart.getItems(loggedInPhone); 
        double total = 0.0;

        for (CartItem item : items) {
            JPanel itemPanel = new JPanel(new GridLayout(1, 3));
            itemPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            itemPanel.add(new JLabel(item.getName()));
            itemPanel.add(new JLabel("Qty: " + item.getQuantity()));
            itemPanel.add(new JLabel("Rs. " + item.getTotal()));
            panelItems.add(itemPanel);
            total += item.getTotal();
        }

        lblTotal.setText("Total: Rs. " + total);
        panelItems.revalidate();
        panelItems.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CartUI("0771234567").setVisible(true);
        });
    }
}
 