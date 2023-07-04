package Day95Java练习13;

import java.util.Random;
import java.util.Scanner;

public class Practice08猜拳游戏 {
	public static void main(String[] args) {
		Tom player = new Tom();
		String[][] result = new String[3][4];
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i < 3;i++) {
			System.out.println("请输入你出的手势，“0”表示“石头”，“1”表示“剪刀”，“2”表示“布”");
			int tomGuessNum = sc.nextInt(3);
			player.setTomGuessNum(tomGuessNum);
			player.computerNum();
			String str1 = player.result();
			String str2 = "第" + player.count + "场";
			result[i][0] = str2;
			if(player.tomGuessNum == 0) {
				result[i][1] = "你出的是【石头】";
			}else if(player.tomGuessNum == 1) {
				result[i][1] = "你出的是【剪刀】";
			}else if(player.tomGuessNum == 2) {
				result[i][1] = "你出的是【布】";
			}
			if(player.comGuessNum == 0) {
				result[i][2] = "电脑出的是【石头】";
			}else if(player.comGuessNum == 1) {
				result[i][2] = "电脑出的是【剪刀】";
			}else if(player.comGuessNum == 2) {
				result[i][2] = "电脑出的是【布】";
			}
			result[i][3] = str1;
		}
		sc.close();
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 4;j++) {
				System.out.print(result[i][j] + "；");
			}
			System.out.println();
		}
	}
}

class Tom{
	
	int tomGuessNum;//玩家出拳的类型
	int comGuessNum;//电脑出拳的类型
	int winCountNum;//玩家赢的次数
	int count = 0;//比赛一共有3场
	
	public void setTomGuessNum(int tomGuessNum) {
		if(tomGuessNum > 2 || tomGuessNum < 0) {
			throw new IllegalArgumentException("数字输入有误");
		}
		this.tomGuessNum = tomGuessNum;
	}
	
	public int computerNum() {
		Random r = new Random();
		comGuessNum = r.nextInt(3);
		return comGuessNum;
	}
	
	public String result() {
		String str1 = "你赢了";
		String str2 = "你输了";
		String str3 = "平手";
		count++;
		if(tomGuessNum == 0 && comGuessNum == 2) {
			return str2;
		}else if(tomGuessNum == 1 && comGuessNum == 0) {
			return str2;
		}else if(tomGuessNum == 2 && comGuessNum == 1) {
			return str2;
		}else if(tomGuessNum == comGuessNum) {
			return str3;
		}else {
			return str1;
		}
	}
}
