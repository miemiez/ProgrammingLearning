import java.util.Scanner;

public class TestLoop{
	public static void main(String[] args) {
		//switch
		char d = 'd';
		switch(d) 
		{
		case 'a':
			System.out.println("优秀");
			break;
		case 'b':
			System.out.println("良好");
			break;
		case 'c':
			System.out.println("中");
			break;
		case 'd':
			System.out.println("及格");
			break;
		case 'e':
			System.out.println("不及格");
			break;
		default:
			break;
		}
		System.out.println("等级为：" + d);
		System.out.println("\n");
		
		
		//while
		int x = 10;
	    while(x < 20) {
	        System.out.println("x的值为：" + x );
	        x++;
	    }
	    System.out.println("\n");
	    
	    
	    //do while
	    int y = 10;
	    do {
	    	System.out.println("y的值为：" + y );
	        y++;
	    }while(y > 20);
	    System.out.println("\n");
	    
	    
	    //for
	    for(int z = 10; z < 20; z++) {
	        System.out.println("z的值为：" + z );
	    }
	    System.out.println("\n");
	    
	    
	    //增强for循环
	    int[] num = {5,6,7,8,9,10};
	    for(int en : num) {
	    	System.out.println(en);
	    }
	    System.out.println("\n");
	    
	    
		/*模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果。

		要求：

​		键盘录入三个整数,其中前两个整数代表参加运算的数据，第三个整数为要进行的运算(1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)，演示效果如下:

​			请输入第一个整数: 30

​			请输入第二个整数: 40

​			请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法): 1

​			控制台输出:30+40=70*/
		Scanner cal = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int inte1 = cal.nextInt();
		System.out.println("请输入第二个整数：");
		int inte2 = cal.nextInt();
		System.out.println("请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法)：");
		int inte3 = cal.nextInt();
		switch(inte3)
		{
		case 1:
			System.out.println(inte1 + "+" + inte2 + "=" + (inte1 + inte2));
			break;
		case 2:
			System.out.println(inte1 + "-" + inte2 + "=" + (inte1 - inte2));
			break;
		case 3:
			System.out.println(inte1 + "*" + inte2 + "=" + (inte1 * inte2));
			break;
		case 4:
			System.out.println(inte1 + "/" + inte2 + "=" + (inte1 / inte2));
			break;
		default:
			System.out.println("您输入的内容有误！");
		}
		System.out.println('\n');
		
		
		/*需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，

​		假如我有一张足够大的纸，它的厚度是0.1毫米。

​		请问，我折叠多少次，可以折成珠穆朗玛峰的高度?*/
		double zm = 8844430;
		double paper = 0.1;
		int time = 0;
		while(paper < zm) {
			paper = paper * 2;
			time++;
		}
		System.out.println("折叠" + time + "次，可以折成珠穆朗玛峰的高度。");
		System.out.println("\n");
		
		
		/*中国有闰年的说法。闰年的规则是：四年一闰，百年不闰，四百年再闰。（年
		  份能够被4整除但不能被100整除算是闰年，年份能被400整除也是闰年）。
		  请打印出1988年到2019年的所有闰年年份。*/
		for(int rn = 1988;1988 <= rn && rn <= 2019;rn++) {
			if(rn % 4 == 0 && rn % 100 != 0 || rn % 400 == 0) {
				System.out.println(rn + "年是闰年");
			}
		} 
		System.out.println("\n");
		
		
		/*已知2019年是猪年，请在控制台输出从1949年到2019年中所有是猪年的年份。*/
		for(int zhu = 2019;zhu >= 1949;zhu--) {
			if((zhu -2019) % 12 == 0) {
				System.out.println(zhu + "年是猪年");
			}
		}
	}
}