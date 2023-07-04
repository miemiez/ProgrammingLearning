package Day92Java练习10;

import java.util.ArrayList;
import java.util.List;

public class Practice02八皇后 {
	public static void main(String[] args) {
		Practice02八皇后 p = new Practice02八皇后();
		List<ArrayList<String>> lists = p.solveQueen(8);
		for(ArrayList<String> list : lists) {
			System.out.println(list);
		}
	}
	
	List<ArrayList<String>> lists = new ArrayList<>();
	int[] arr;//记录行列，index + 1值为行，arr[index] + 1值为列
	int count = 0;//记录次数
	
	public List<ArrayList<String>> solveQueen(int n){
		arr = new int[n];
		int i = check(n,0);
		System.out.println(i);
		return lists;
	}
	
	public int check(int n,int index) {
		if(n == index) {
			ArrayList<String> list = new ArrayList<>();
			for(int i = 0;i < n;i++) {
				StringBuilder sb = new StringBuilder();
				for(int j = 0;j < n;j++) {
					if(arr[i] == j) {
						sb.append("Q");
					}else {
						sb.append(".");
					}
				}
				list.add(new String(sb));
			}
			count += 1;
			lists.add(list);
		}else {
			for(int i = 0;i < n;i++) {
				arr[index] = i;
				if(judge(index)) {
					check(n,index + 1);
				}
			}
		}
		return count;
	}
	
	public boolean judge(int index) {
		for(int i = 0;i < index;i++) {
			if(arr[i] == arr[index] || Math.abs(i - index) == Math.abs(arr[i] - arr[index])) {
				return false;
			}
		}
		return true;
	}
}
