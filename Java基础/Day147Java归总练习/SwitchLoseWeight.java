package Day0607;

import java.util.Scanner;

/*
需求：键盘录入星期数，显示今天的减肥活动
周一：跑步
周二：游泳
周三：慢走
周四：动感单车
周五：拳击
周六：爬山
周日：好好吃一顿
 */
public class SwitchLoseWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入星期：");
        String week = scanner.next();

        switch (week) {
            case "周一" :
                System.out.println("跑步");
                break;
            case "周二" :
                System.out.println("游泳");
                break;
            case "周三" :
                System.out.println("慢走");
                break;
            case "周四" :
                System.out.println("动感单车");
                break;
            case "周五" :
                System.out.println("拳击");
                break;
            case "周六" :
                System.out.println("爬山");
                break;
            case "周日" :
                System.out.println("好好吃一顿！");
                break;
            default:
                System.out.println("输入有误。");
                break;
        }
    }
}
