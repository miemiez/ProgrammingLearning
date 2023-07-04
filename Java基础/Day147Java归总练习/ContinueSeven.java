package Day0607;

import java.util.Scanner;

public class ContinueSeven {
    /*
    从任意一个数字开始，其中包含7和7的倍数就要说：过，
    打印1-100之间满足条件的数据
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1-100的任意整数");
        int i = sc.nextInt();
        for (; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
