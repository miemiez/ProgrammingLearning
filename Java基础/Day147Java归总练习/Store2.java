package Day147Java归总练习;

public class Store2 {
    String productType;

    public Store2(String productType) {
        this.productType = productType;
    }

    public void advertise() {
        System.out.println(productType);
        System.out.println("come spend some money!");
    }

    public static void main(String[] args) {
        Store2 lemonadeStand = new Store2("Lemonade");
        lemonadeStand.advertise();
        lemonadeStand.advertise();
        lemonadeStand.advertise();
    }
}
