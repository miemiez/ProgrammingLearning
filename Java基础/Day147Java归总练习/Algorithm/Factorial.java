package Day0617.factorial;

public class Factorial {
    public static int iterativeFactorial(int n) {
        int result = 1;

        while (n > 0) {
            result *= n;
            n -= 1;
        }

        return result;
    }
    public static void main(String[] args) {

        int fourFactorial = iterativeFactorial(4);
        System.out.println(fourFactorial);
    }
}