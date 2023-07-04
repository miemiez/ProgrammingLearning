package Day0609;

public class StToString {
    String productType;
    double price;

    public StToString(String productType, double price) {
        this.productType = productType;
        this.price = price;
    }

    public void price(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    public double getPriceWithTax() {
        double tax = 0.08;
        double totalPrice = price + price*tax;
        return totalPrice;
    }

    public String toString() {
        return "This st sells" + productType + "at a price of " + price + ".";
    }

    public static void main(String[] args) {
        StToString lemonade = new StToString("Lemonade", 3.75);
        StToString cookies = new StToString("Cookies", 5);

        System.out.println(lemonade);
        System.out.println(cookies);
    }
}
