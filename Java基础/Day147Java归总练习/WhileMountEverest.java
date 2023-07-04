package Day147Java归总练习;

import Day0509.数据类型;
import org.w3c.dom.ls.LSOutput;

public class WhileMountEverest {
    /*
    一张纸的厚度是0.1毫米，要折叠多少次能达到珠穆朗玛峰的高度8844430毫米
     */

    //思路；折叠就是原厚度乘以2
    public static void main(String[] args) {
        double thickness = 0.1;
        int height = 8844430;
        int cont = 0;
        while (thickness < height) {
            thickness *= 2;
            cont++;
        }
        System.out.println("当纸张折叠" + cont + "次时，达到珠穆朗玛峰的高度");
    }

}
