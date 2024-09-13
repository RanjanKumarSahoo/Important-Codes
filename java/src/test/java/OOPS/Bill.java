package OOPS;

class Bill extends Product {
    private static final double GST_RATE = 0.18; // 18% GST
    private static final double DISCOUNT_RATE = 0.05; // 5% Discount on items over 500

    // Constructor that calls the parent class constructor
    public Bill(String productName, double price, int quantity) {
        super(productName, price, quantity);
    }

    // Method to calculate GST on the total price if the total price exceeds 500
    public double calculateGST() {
        if (getTotalPrice() > 500) {
            return getTotalPrice() * GST_RATE;
        } else {
            return 0;
        }
    }

    // Method to calculate a 5% discount on the total price
    public double calculateDiscount() {
        if( getTotalPrice() > 500) {
        	return getTotalPrice() * DISCOUNT_RATE;
        }else {
        	return 0;
        }
    }

    // Method to calculate the final amount after applying discount and GST
    public double calculateFinalAmount() {
        double totalPrice = getTotalPrice();
        double discount = calculateDiscount();
        double gst = calculateGST();
        return totalPrice - discount + gst;
    }

    // Method to display the bill
    public void displayBill() {
        System.out.println("Product: " + getProductName());
        System.out.println("Price per Item: " + getPrice());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Total Price: " + getTotalPrice());
        System.out.println("Discount (5%): -" + calculateDiscount());
        System.out.println("GST (18% if price > 500): +" + calculateGST());
        System.out.println("Final Amount: " + calculateFinalAmount());
        System.out.println("------------------------");
    }
}