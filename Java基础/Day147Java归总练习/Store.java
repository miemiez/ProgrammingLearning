package Day0609;

public class Store {

        String productType;
        int inventoryCount;
        double inventoryPrice;

    public Store(String product, int Count, double Price) {
        this.productType = product;
        this.inventoryCount = Count;
        this.inventoryPrice = Price;
    }

    public static void main(String[] args) {
        Store cookieShop = new Store("cookies",12,3.75);

    }
}
