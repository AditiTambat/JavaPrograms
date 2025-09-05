package ReflectionApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class PersonMain {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
		Class<?> c =Class.forName("ReflectionApi.Person");   //Class is Class having forname method->packagename.classname
		
		Constructor <?>[] constructors= c.getDeclaredConstructors(); 
		
		Object obj=c.getConstructor().newInstance(args);
		
		
		for(Constructor d:constructors) {
			System.out.println(d.getName());
			System.out.println(d.getParameterCount());
			
			
			Parameter [] p=d.getParameters();
			for(Parameter pm:p) {
				System.out.println(pm.getName());
				System.out.println(pm.getModifiers());
				System.out.println(pm.getType());
			}
			System.out.println(" ****************** ");
		}
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Field[] fields = c.getDeclaredFields(); //-> gives all fields. 
		//c.getFields()-> gives public fields only
		
		for(Field f:fields) {
			System.out.println(f);
		}
		
		
		// for accessing set the value as true of setAccessible 
		
		Field email_set = c.getDeclaredField("email");
		email_set.setAccessible(true);
		
		email_set.set(obj, "abc@gmail.com");
		System.out.println(email_set.get(obj));
		
		
		
		System.out.println("```````````Methods```````````");
		
		Method [] methods=c.getDeclaredMethods();
		for(Method m: methods) {
			System.out.println(m);
		}
		
		Method method_name=c.getDeclaredMethod("getName", String.class);
		method_name.setAccessible(true);
		
		method_name.invoke(obj,"ABCZ" );
	}

	

}
