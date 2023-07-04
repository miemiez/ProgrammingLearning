package Day147Java归总练习;

import java.util.Scanner;

public class ForDivision {
    public static void main(String[] args) {
        /*
        键盘录入两个数字，表示一个范围。
        统计这个范围中：
        即能被3整除又能被5整除的数字有多少个？
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字表示开始");
        int start = sc.nextInt();
        System.out.println("请输入一个数字表示结束");
        int end = sc.nextInt();
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count ++;
            }
        }
        System.out.println("在" + start + "和" + end + "之间，" +
                "即能被3整除又能被5整除的数字有" + count + "个");
    }
}
