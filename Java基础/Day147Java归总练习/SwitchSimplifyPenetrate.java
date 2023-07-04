package Day147Java归总练习;

import java.util.Scanner;

/*
需求：
键盘录入星期数，输出工作日或休息日
1-5工作日，6-7休息日
 */
public class SwitchSimplifyPenetrate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：（数字1-7）");
        int week = sc.nextInt();
        switch (week) {
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default-> System.out.println("输入有误");


        }
    }
}
