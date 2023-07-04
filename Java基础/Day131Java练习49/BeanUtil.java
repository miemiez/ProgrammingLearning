package Day131Java练习49;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class BeanUtil {
	public static <T>T getBean(Class clazz) {
		T obj = null;
		try {
			Constructor con = clazz.getConstructor();
			obj = (T)con.newInstance();
			Field[] fields = clazz.getDeclaredFields();
			for(Field f : fields) {
				MyAnno an = f.getAnnotation(MyAnno.class);
				Class cAnno = an.getClass();
				Method mAnno = cAnno.getMethod("myValue");
				String str = (String)mAnno.invoke(an);
				String name = "set" + f.getName().substring(0,1).toUpperCase() + f.getName().substring(1);
				Method mName = clazz.getMethod(name, f.getType());
				mName.invoke(obj, str);
			}
		} catch (Exception e) {	
			e.printStackTrace();
		}
		
		return obj;
	}
}
