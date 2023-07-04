package Day147Java归总练习;

//求最值
public class ArrayMax {
    public static void main(String[] args) {
        /*
        数组：33，44，5，22，55
        求最大值
         */

      int[] arr = {33,44,5,22,55};
      int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
