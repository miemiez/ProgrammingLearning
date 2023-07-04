package Day147Java归总练习;
@SuppressWarnings({"all"})
public class Debug {

    public static void main(String[] args) {

        try {
            int width = 0;

            int length = 40;

            int ratio = length / width;

        } catch (ArithmeticException e) {

            System.err.println("NullPointerException: " + e.getMessage());
        }

    }

}
