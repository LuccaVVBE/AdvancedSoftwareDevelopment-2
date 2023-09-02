package domein;

import java.lang.reflect.*;

public class NonOwnerInvocationHandler implements InvocationHandler {

	private PersonBean personBean;

	public NonOwnerInvocationHandler(PersonBean pb) {
		personBean = pb;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(personBean, args);
			}
			if(method.getName().equals("setHotOrNotRating")) {
				return method.invoke(personBean, args);
			}
			if(method.getName().startsWith("set")) {
				throw new IllegalAccessException();
			}
		
		} catch (InvocationTargetException ite) {
			ite.printStackTrace();
		}
		return null;
	}

}
