import java.util.ArrayList;
public class TestArrayList{
	public static void main(String[] args) {
		ArrayList<Integer> temperatures = new ArrayList<Integer>();
		temperatures.add(34);
		temperatures.add(35);
		temperatures.add(24);
		temperatures.add(0);
		temperatures.set(0, 30);//改34为30
		temperatures.remove(2);//删除24
		System.out.println(temperatures.get(2));//打印索引为【2】的参数（30）
		System.out.println(temperatures.get(0));
		System.out.println(temperatures.size());//多少参数
	}
}