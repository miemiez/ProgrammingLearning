package Day105Java练习23;

public class 房屋出租需求 {
	/*
	 * 实现基于文本界面的《房屋出租软件》
	 * 能够实现对房屋信息的添加，修改和删除（用数组实现），并能够打印房屋明细表
	 * 
	 * ----------房屋出租系统----------
	 *          1.新增房源
	 *          2.查找房屋
	 *          3.删除房屋
	 *          4.修改房屋信息
	 *          5.房屋列表
	 *          6.退出
	 */
	public static void main(String[] args) {//程序入口
		HouseView hv = new HouseView();
		hv.mainMenu();
	}
}
