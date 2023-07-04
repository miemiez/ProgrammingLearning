package Day105Java练习23;

import java.util.Scanner;

public class HouseView {
	/*
	 * 【界面层】
	 * 1.显示界面
	 * 2.接受用户的输入
	 * 3.调用其它类完成对房屋信息的各种操作
	 */
	private boolean loop = true;
	private Scanner scanner = new Scanner(System.in);
	private HouseService houseService = new HouseService(10);
	
	public int acciveInput() {
		while(true) {
			System.out.println("请输入操作编号（1~6）");
			int i = scanner.nextInt();
			if(i < 1 || i > 6){
				System.out.println("请输入正确的编号");
			}else {
				return i;
			}
		}
	}
	
	public void mainMenu() {
		do {
			System.out.println("----------房屋出租系统----------" + 
					"\r\t\t1.新增房源" + 
					"\r\t\t2.查找房屋" + 
					"\r\t\t3.删除房屋" + 
					"\r\t\t4.修改房屋信息" +
					"\r\t\t5.房屋列表" + 
					"\r\t\t6.退出");
			switch(acciveInput()){
				case 1:
					System.out.println("----------新增房源----------");
					addHouse();
					break;
				case 2:
					System.out.println("----------查找房屋----------");
					selectHouse();
					break;
				case 3:
					System.out.println("----------删除房屋----------");
					deletHouse();
					break;
				case 4:
					System.out.println("----------修改房屋信息----------");
					updateHouse();
					break;
				case 5:
					System.out.println("----------房屋列表----------");
					listHouses();
					break;
				case 6:
					System.out.println("是否确认退出!");
					String str = scanner.next();
					if(str.equals("Y")) {
						loop = false;
					}
					break;
			}
		}while(loop);
	}
	
	public void addHouse() {
		System.out.println("姓名：");
		String name = scanner.next();
		System.out.println("电话：");
		String phone = scanner.next();
		System.out.println("地址：");
		String address = scanner.next();
		System.out.println("月租：");
		int rent = scanner.nextInt();
		System.out.println("状态：");
		String state = scanner.next();
		House newHouse = new House(0,name,phone,address,rent,state);//创建一个新的House对象，id是系统分配的
		if(houseService.addHouse(newHouse)) {
			System.out.println("----------添加房屋成功----------");
		}else {
			System.out.println("----------添加房屋失败----------");
		}
	}
	
	public void deletHouse() {
		System.out.println("请输入待删除房屋编号（-1退出）：");
		int id = scanner.nextInt();
		if(id == -1) {
			System.out.println("----------放弃删除房屋信息----------");
			return;
		}
		while(true) {
			System.out.println("是否确认删除该房屋（Y/N）");
			String judge = scanner.next();
			if(judge.equals("Y")) {
				if(houseService.deletHouse(id)) {
					System.out.println("----------删除房屋信息成功----------");
					break;
				}
			}else if(judge.equals("N")){
				System.out.println("----------房屋编号不存在，删除失败----------");
				break;
			}else {
				System.out.println("----------输入失败，请重写输入----------");
			}
		}
	}
	
	public void selectHouse() {
		System.out.println("请输入你要查找的房屋编号：");
		int id = scanner.nextInt();
		House h = houseService.selectHouse(id);
		if(h != null) {
			System.out.println("编号\t房主\t电话\t地址\t月租\t状态（未出租/已出租）");
			System.out.println(h);
		}else {
			System.out.println("----------该房屋不存在----------");
		}
	}
	
	public void updateHouse() {
		System.out.println("请输入你要修改的房屋编号：");
		int id = scanner.nextInt();
		House h = houseService.selectHouse(id);
		if(h != null) {
			System.out.println("姓名：");
			String name = scanner.next();
			System.out.println("电话：");
			String phone = scanner.next();
			System.out.println("地址：");
			String address = scanner.next();
			System.out.println("月租：");
			int rent = scanner.nextInt();
			System.out.println("状态：");
			String state = scanner.next();
			houseService.updateHouse(h, name, phone, address, rent, state);
		}else {
			System.out.println("----------该房屋不存在----------");
		}
	}
	
	public void listHouses() {
		System.out.println("编号\t房主\t电话\t地址\t月租\t状态（未出租/已出租）");
		House[] houses = houseService.listHouses();
		for(int i = 0;i < houses.length;i++) {
			if(houses[i] == null) {
				break;
			}
			System.out.println(houses[i]);
		}
		System.out.println("----------房屋列表显示完毕----------");
	}
}
