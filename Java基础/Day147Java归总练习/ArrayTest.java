package Day147Java归总练习;

public class ArrayTest {
    public static void main(String[] args) {
        /*
        定义一个数组，遍历每个元素，统计里面一共有多少个能被3整除的数字。
         */
        //3.定义计数器
        int count = 0;
        //1.定义一个数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //2.遍历数组
        for (int i = 0; i < arr.length; i++) {
            //i是索引
            //arr【i】是元素
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
