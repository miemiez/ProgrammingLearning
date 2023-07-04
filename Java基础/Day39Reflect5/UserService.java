package Day39Reflect5;

public class UserService {
	public boolean login(String name,String password) {
		if("LHY".equals(name) && "123456".equals(password)) {
			return true;
		}
		return false;
	}
	
	public void logout() {
		System.out.println("退出登录！");
	}
}
