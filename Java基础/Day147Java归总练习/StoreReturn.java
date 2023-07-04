package Day147Java归总练习;

public class StoreReturn {
    String productType;
    double price;

    public StoreReturn(String productType, double price) {
        this.productType = productType;
        this.price = price;
    }

    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    public double getPriceWithTax() {
        double tax = 0.08;
        double totalPrice = price + price*tax;
        return totalPrice;
    }

    public static void main(String[] args) {
        StoreReturn lemonade = new StoreReturn("Lemonade", 3.75);

        double lemonadePrice = lemonade.getPriceWithTax();

        System.out.println(lemonadePrice);
    }
}
