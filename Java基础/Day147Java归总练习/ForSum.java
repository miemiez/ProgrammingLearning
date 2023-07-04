package Day0607;

public class ForSum {
    public static void main(String[] args) {
        /*
        求出1-100之间的偶数和
         */
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("1-100之间的偶数和为: " + sum);//2550
    }
}
