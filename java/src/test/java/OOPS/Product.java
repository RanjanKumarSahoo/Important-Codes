package OOPS;

public class Product {
	
	    private String productName;
	    private double price;
	    private int quantity;

	    // Constructor
	    public Product(String productName, double price, int quantity) {
	        this.productName = productName;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    // Getters for the product details
	    public String getProductName() {
	        return productName;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    // Method to calculate the total price (price * quantity)
	    public double getTotalPrice() {
	        return price * quantity;
	    }
	}

