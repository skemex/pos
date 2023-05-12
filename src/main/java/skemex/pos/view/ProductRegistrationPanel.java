package skemex.pos.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import skemex.pos.vo.Product;

public class ProductRegistrationPanel extends JPanel {
	// Labels for input fields
	private JLabel codeLabel, nameLabel, buyPriceLabel, sellPriceLabel, quantityLabel, revenueLabel;

	// Input fields for product name, buy price, sell price, quantity, and revenue
	private JTextField codeField, nameField, buyPriceField, sellPriceField, quantityField, revenueField;

	// Button to submit product registration
	private JButton submitButton;
	private JButton calcSellPrice;

	public ProductRegistrationPanel() {
		// Set panel layout
		setLayout(new GridLayout(6, 2));

		// Initialize input fields and labels
		codeLabel = new JLabel("Code:");
		codeField = new JTextField();
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
		add(codeLabel);
		add(codeField);
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
		submitButton.addActionListener(e -> {
			// Create new product
			String code = codeField.getText();
			String name = nameField.getText();
			double buyPrice = Double.parseDouble(buyPriceField.getText());
			int quantity = Integer.parseInt(quantityField.getText());
			double revenuePercentage = Double.parseDouble(revenueField.getText());
			Product p = new Product(code, name, buyPrice, revenuePercentage, quantity);
			System.out.println(p);
		});
	}

	public void setBuyPriceField(JTextField buyPriceField) {
		this.buyPriceField = buyPriceField;
	}

	public void setRevenueField(JTextField revenueField) {
		this.revenueField = revenueField;
	}

	public void setSellPriceField(JTextField sellPriceField) {
		this.sellPriceField = sellPriceField;
	}

	public void setSubmitButton(JButton submitButton) {
		this.submitButton = submitButton;

	}

	public void setCalcSellPrice(JButton calcSellPrice) {
		this.calcSellPrice = calcSellPrice;
	}
}
