package Day105Java练习23;

public class HouseService {
	/*
	 * 【业务层】
	 * 1.响应HouseView的调用
	 * 2.完成对房屋信息的各种操作（增删改查）
	 */
	private House[] houses;
	private int houseNums = 0;//记录当前有多少个房屋信息
	private int idCounter = 0;//记录当前id增长到几
	
	public HouseService(int size) {
		houses = new House[size];
	}
	
	public boolean addHouse(House newHouse) {
		if(houseNums == houses.length) {
			System.out.println("数组已满，不能再添加了...");
			return false;
		}
		houses[houseNums++] = newHouse;
		newHouse.setId(++idCounter);
		return true;
	}
	
	public boolean deletHouse(int id) {
		int index = -1;
		for(int i = 0;i < houses.length;i++) {
			if(id == houses[i].getId()) {
				index = i;
			}
		}
		if(index == -1) {
			return false;
		}
		for(int i = index;i < houseNums -1;i++) {
			houses[i] = houses[i+1];
		}
		houses[--houseNums] = null;
		return true;
	}
	
	public House selectHouse(int id) {
		for(int i = 0;i < houses.length;i++) {
			if(id == houses[i].getId()) {
				return houses[i];
			}
		}
		return null;
	}
	
	public House updateHouse(House h,String name, String phone, String address, int rent, String state) {
		h.setName(name);
		h.setPhone(phone);
		h.setAddress(address);
		h.setRent(rent);
		h.setState(state);
		return h;
	}
	
	public House[] listHouses() {
		return houses;
	}
}
