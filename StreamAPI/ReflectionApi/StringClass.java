package ReflectionApi;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StringClass {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class<?> c = Class.forName("java.lang.String");
		
		String s =new String();
		
		Class <?> c1 = c.getClass();
		Method[] method = c.getDeclaredMethods();
		
		Object obj=c.getConstructor().newInstance();
		
		for(Method m:method) {
			System.out.println(m);
		}
		
		System.out.println(method.length);
		
		 System.out.println("**************************************");
		 Field[] field=c.getDeclaredFields();
		 
		 
		 for(Field f: field)
		 {
			 System.out.println(f);
		 }
		 
		 System.out.println("Fields:"+field.length);
	}

}
