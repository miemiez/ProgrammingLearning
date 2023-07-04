package Day73Java9新特性02;

import java.io.IOException;
import java.io.InputStreamReader;

public class 异常处理try结构的使用升级 {
	public static void main(String[] args) {
		/* 
	     * 例：
	     * (1)JDK8之前
	     */
		InputStreamReader reader = null;
		try {
			reader = new InputStreamReader(System.in);
			reader.read();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/*
		 * 例：
		 * (2)JDK8
		 *     在例1基础上，升级了的写法，不用显示的处理资源的关闭【要求：要完成资源的实例化，必须放在try的一对()内完成】
		 */
		try(InputStreamReader reader1 = new InputStreamReader(System.in)){
			//【说明：此时的reader1是final的（常量），不可以在被赋值】
			reader1.read();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * 例：
		 * (3)JDK9
		 *     在8的基础上，再度升级
		 *     可以在try()中调用已经实例化的资源对象【同样也不需要处理资源的关闭】
		 *     
		 * InputStreamReader reader2 = new InputStreamReader(System.in);
		 * OutputStreamWriter writer = new OutputStreamWriter(System.out);
		   try(reader2;writer){【说明：此时的reader2和writer是final的（常量），不可以在被赋值】
			   reader2.read();
			   writer.write(75);
		   }catch(IOException e){
		       e.printStrackTrace();
		   }
		 */
		
	}
}
