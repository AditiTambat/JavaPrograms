package ReflectionAPI;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AccessMethod {

	public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
		Class <?> c = Class.forName("ReflectionAPI.Person");
		
		

		Object o = c.getDeclaredConstructor().newInstance();
		
		Field[] fields = c.getDeclaredFields();
		for(Field f:fields) {
			System.out.println(f);
		}
		
		Method[] methods = c.getDeclaredMethods();
		for(Method m: methods) {
			System.out.println(m);
		}
		
		 Field salaryField = c.getDeclaredField("salary");
	        salaryField.setAccessible(true);
	        salaryField.set(o, 60000.0);

		
//		Method getSalary=c.getDeclaredMethod("getSalary",double.class);
		Method getSalary=c.getDeclaredMethod("getSalary");
		getSalary.setAccessible(true);
//		System.out.println(getSalary.invoke(o,20000.0));
		getSalary.invoke(o);
		

	}

}
