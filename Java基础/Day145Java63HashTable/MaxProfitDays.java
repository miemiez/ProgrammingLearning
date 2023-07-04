package Day145Java63HashTable;

import java.util.*;

public class MaxProfitDays {
  public static void main(String[] args) {
    int[] stockPrices = {17, 11, 60, 25, 150, 75, 31, 120};
    int[] maxProfitDays = (maxProfitDays(stockPrices));
    System.out.println(maxProfitDays[0]);
    System.out.println(maxProfitDays[1]);
  }

  public static int[] maxProfitDays(int[] stockPrices) {
    // Add your code here
    int[] arr = new int[2];
    int temp = 0;
    int a = 0;
    int b = 0;
    for(int i = 0;i < stockPrices.length;i++){
      for(int j = 0;j < stockPrices.length - i;j++){
        if(temp < Math.abs(stockPrices[i] - stockPrices[j])){
          temp = Math.abs(stockPrices[i] - stockPrices[j]);
          a = i;
          b = j;
        }
      }
    }
    if(a < b){
        arr[0] = a;
        arr[1] = b;
      }else{
        arr[0] = a;
        arr[1] = b;
      }
    return arr;
  }
}