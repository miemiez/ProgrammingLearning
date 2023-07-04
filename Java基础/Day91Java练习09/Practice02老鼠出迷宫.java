package Day91Java练习09;

public class Practice02老鼠出迷宫 {
	public static void main(String[] args) {
		/*
		 * 老鼠出迷宫
		 */
		
		/*
		 * 思路
		 *     1.先创建迷宫，用二维数组表示 int[][] map = new int[8][7];
		 *     2.指定规则，map数组的元素值：0表示可以走的路，1表示不可以走的路
		 */
		int[][] map = new int[8][7];
		/*
		 *     3.将
		 */
		for(int i = 0;i < map.length;i++) {
			for(int j = 0;j < map[i].length;j++) {
				if(i == 0 || i == map.length - 1 || j == 0 || j == map[i].length - 1) {
					map[i][j] = 1;
				}else if(i == 3 && j < 3){
					map[i][j] = 1;
				}else {
					map[i][j] = 0;
				}
			}
		}
		//如果这样设置地图，会出现回溯现象，走过的路不通则为3，继续从初始位置开始，通过右上左的策略继续判断找路
		map[2][2] = 1;
		
		//如果这样设置地图，根据最后的递归，路线显示的数字为3
//		map[3][3] = 1;
//		map[3][4] = 1;
//		map[2][4] = 1;
//		map[1][4] = 1;
		
		for(int i = 0;i < map.length;i++) {
			for(int j = 0;j < map[i].length;j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=============");
		
		T t = new T();
		t.findWay(map, 1, 1,0);
		for(int i = 0;i < map.length;i++) {
			for(int j = 0;j < map[i].length;j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class T {
	//使用递归回溯的思想来解决老鼠出迷宫【重要的是确定出口；指定各个值在地图中代表什么；确定老鼠找路的策略】
	/*
	 * 1.findWay方法用来专门找出迷宫的路径
	 * 2.如果出去了返回真，如果没有出则返回假
	 * 3.i和j就是老鼠的位置，初始化的位置为（1，1）
	 * 4.因为是递归的找路，所以先规定map数组的各个值的含义：
	 *     0：表示可以走；
	 *     1：表示障碍物；
	 *     2：表示走过的路；
	 *     3：表示走过，但是走不通是死路
	 * 5.当map[6][5]=2就说明找到通路，就可以退出，否则继续找路
	 * 6.确定老鼠找路的策略 下->右->上->左【策略不同得出的结果也不同】
	 */
	public boolean findWay(int[][] map,int i,int j,int count) {
		if(map[6][5] == 2) {//表示找到出口
			System.out.println(count);
			return true;
		}else {
			if(map[i][j] == 0) {//继续找路
				map[i][j] = 2;
				if(findWay(map,i+1,j,count + 1)) {
					return true;
				}else if(findWay(map,i,j+1,count + 1)) {
					return true;
				}else if(findWay(map,i-1,j,count + 1)) {
					return true;
				}else if(findWay(map,i,j-1,count + 1)) {
					return true;
				}else {
					map[i][j] = 3;
					return false;
				}
			}else {//map[i][j] = 1 | 2 | 3
				return false;
			}
		}
	}
}
