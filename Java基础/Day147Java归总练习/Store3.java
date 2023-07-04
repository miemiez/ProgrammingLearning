package Day0609;

public class Store3 {
    String productType;

    public Store3(String productType) {
        this.productType = productType;
    }

    public void advertise() {
        String message = "Selling" + productType +"!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        String cookie = "Cookies";
        Store3 cookieShop = new Store3(cookie);

        cookieShop.advertise();
    }
}
