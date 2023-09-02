package domein;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DomeinController {

	public void runMethod(String methodeNaam) {
		// TODO Auto-generated method stub
		try {	
			Method method = this.getClass().getMethod(methodeNaam, new Class[0]);
			method.invoke(this, new Object[0]); // xyz.method(params);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			noWorky();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//MOET PUBLIC ZIJN OF RUNMETHOD VINDT DEZE METHODE NIET!
	public void doewa() {
		System.out.println("execution of doewa");
	}
	
	private void noWorky() {
		System.out.println("this method was not yet implemented. It no worky :-(");
	}

}
