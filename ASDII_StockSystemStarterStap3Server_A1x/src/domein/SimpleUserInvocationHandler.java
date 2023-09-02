package domein;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SimpleUserInvocationHandler implements InvocationHandler {
	
    private StockService service;
    
    public SimpleUserInvocationHandler(StockService stockService) {
        this.service = stockService;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws AccessDeniedException {
        try {
            if (method.getName().equals("productenView")) { //hier alle toegelaten methoden voor een simpleUser
                return method.invoke(service, args);
            }
            throw new AccessDeniedException();
        } catch (InvocationTargetException | IllegalAccessException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}