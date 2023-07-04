package Day0610;
@SuppressWarnings({"all"})
public class Reverse {
    public static String reverseLoop(String text) {
        String reversed = new String("");
        for (int i = 0; i < text.length(); i++) {
            reversed = text.charAt(i) + reversed;
        }
        return reversed;
    }

    public static String reverseRecursive(String text) {
        if (text.length() == 0) {
            return text;
        } else {
            return reverseRecursive(text.substring(1)) + text.charAt(0);
        }
    }

    public static void main(String[] args) {
        String str = new String("howdy");
        String reverse = reverseRecursive(str);
        System.out.println(reverse);
    }
}
