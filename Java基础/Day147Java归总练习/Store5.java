package Day147Java归总练习;

public class Store5 {
    String productType;
    double price;

    public Store5(String productType, double price) {
        this.productType = productType;
        this.price = price;
    }

    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    public static void main(String[] args) {
        Store5 lemonade = new Store5("Lemonade", 3.75);
        lemonade.increasePrice(1.5);
        System.out.println(lemonade.price);
    }
}
