package Day147Java归总练习;

public class MultAndDivide {
    public static void main(String[] args) {
        double subtotal = 30;
        double tax = 0.0875;

        double total = subtotal + subtotal*tax;

        System.out.println(total);

        double perPerspn = total/4;

        System.out.println(perPerspn);
    }
}
