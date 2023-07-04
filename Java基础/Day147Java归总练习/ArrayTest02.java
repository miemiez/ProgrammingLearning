package Day147Java归总练习;

/*
定义一个数组
遍历每个数组
如果是奇数，则将当前数字扩大两倍
如果是偶数，则将当前数字缩小1/2
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[i] / 2;//改完还要替换回去
            } else  {
                array[i] = array[i] * 2;//改完还要替换回去
            }
        }
        //再次遍历数组
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
