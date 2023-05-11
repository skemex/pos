import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProductRegistrationPanel extends JPanel {
    // Labels for input fields
    private JLabel nameLabel, buyPriceLabel, sellPriceLabel, quantityLabel, revenueLabel;
    
    // Input fields for product name, buy price, sell price, quantity, and revenue
    private JTextField nameField, buyPriceField, sellPriceField, quantityField, revenueField;
    
    // Button to submit product registration
    private JButton submitButton;
    private JButton calcSellPrice;
    
    public ProductRegistrationPanel() {
        // Set panel layout
        setLayout(new GridLayout(5, 2));
        
        // Initialize input fields and labels
        nameLabel = new JLabel("Product Name:");
        nameField = new JTextField();
        buyPriceLabel = new JLabel("Buy Price:");
        buyPriceField = new JTextField();
        sellPriceLabel = new JLabel("Sell Price:");
        sellPriceField = new JTextField();
        sellPriceField.setEditable(false); // Make sell price field read-only
        quantityLabel = new JLabel("Quantity:");
        quantityField = new JTextField();
        revenueLabel = new JLabel("Revenue Percentage:");
        revenueField = new JTextField();
        
        // Initialize submit button
        submitButton = new JButton("Register Product");
        calcSellPrice = new JButton("Calc sell price");
        // Add input fields and labels to panel
        add(nameLabel);
        add(nameField);
        add(buyPriceLabel);
        add(buyPriceField);
        add(sellPriceLabel);
        add(sellPriceField);
        add(quantityLabel);
        add(quantityField);
        add(revenueLabel);
        add(revenueField);
        
        // Add button to panel
        add(submitButton);
        add(calcSellPrice);
        
        calcSellPrice.addActionListener(e -> {
           // Calculate sell price
           double buyPrice = Double.parseDouble(buyPriceField.getText());
           double revenuePercentage = Double.parseDouble(revenueField.getText());
           double sellPrice = (buyPrice / (100 - revenuePercentage)) * 100;
           sellPriceField.setText(String.format("%.2f", sellPrice)); // Set sell price field to calculated value
        });

        
        // Add action listener to button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create new product
                String code = "17388446GHE";
                String name = nameField.getText();
                double buyPrice = Double.parseDouble(buyPriceField.getText());
                int quantity = Integer.parseInt(quantityField.getText());
                double revenuePercentage = Double.parseDouble(revenueField.getText());
                Product p = new Product(code, name, buyPrice, revenuePercentage, quantity);
                

            }
        });
    }
}