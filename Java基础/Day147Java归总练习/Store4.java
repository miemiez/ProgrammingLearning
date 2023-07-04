package Day0609;

public class Store4 {
    String productType;

    public Store4(String productType) {
        this.productType = productType;
    }

    public void advertise() {
        String message = "Selling" + productType +"!";
        System.out.println(message);
    }

    public void greetCustomer(String customer) {
        System.out.println("Welcome to the store" + customer + "!");
    }

    public static void main(String[] args) {
        Store4 lemonade = new Store4("Lemonade");
        lemonade.greetCustomer("Laura");
    }
}
