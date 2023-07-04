package Day135Java练习53;

import java.util.Scanner;

public class 注册处理 {
	public static void main(String[] args) {
		/*
		 * 输入用户名，密码，邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象
		 * 
		 * 要求：
		 *     （1）用户名长度为2或3或4
		 *     （2）密码的长度为6，要求全是数字 isDigital
		 *     （3）邮箱中包含@和. 并且@在.的前面
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的用户名，用户名长度要求在2到4之间");
		String name = sc.next();
		System.out.println("请输入您的密码，密码长度要求为6，且都是数字");
		String pwd = sc.next();
		System.out.println("请输入您的邮箱，邮箱格式要正确!!!");
		String email = sc.next();
		userRegister(name,pwd,email);
	}
	
	/*
	 * 思路分析
	 *     （1）先编写方法userRegister(String name,String pwd,String email){}
	 *     （2）针对输入的内容进行校核，如果发现有问题，就抛出异常，给出提示
	 */
	public static void userRegister(String name,String pwd,String email) {
		
		if(name.length() < 2 || name.length() > 4) {
			throw new RuntimeException("用户名长度要求在2到4之间");
		}
		
		if(pwd.length() != 6) {
			throw new RuntimeException("密码长度要求为6");
		}else {
			if(!isDigital(pwd)) {
				throw new RuntimeException("密码要全部都为数字");
			}
		}
		
		if(!(email.contains("@") && email.contains("."))) {
			throw new RuntimeException("邮箱格式要正确!!!");
		}
	}
	
	public static boolean isDigital(String pwd){
		char[] cArr = pwd.toCharArray();
		for(int i = 0;i < cArr.length;i++) {
			if(cArr[i] < 48 || cArr[i] > 57) {
				System.out.println("密码要全部都为数字");
				return false;
			}
		}
		return true;
	}
}
