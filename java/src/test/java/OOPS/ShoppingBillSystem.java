package OOPS;

public class ShoppingBillSystem {
	
	   public static void main(String[] args) {
	        // Create products with name, price, and quantity
	        Bill product1 = new Bill("Laptop", 60000, 1);
	        Bill product2 = new Bill("Mouse", 300, 1);
	        Bill product3 = new Bill("Keyboard", 800, 1);

	        // Display the bill for each product
	        product1.displayBill();
	        product2.displayBill();
	        product3.displayBill();
	    }
	}

