package domein;

import java.util.Objects;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Restaurant {
	
	private Order order;
	private Lock accesLock = new ReentrantLock();
	private Condition kanOrderWegbrengen = accesLock.newCondition();
	private Condition kanOrderKlaarZetten = accesLock.newCondition();
	

	public void zetOrderKlaar(Order order) {
		accesLock.lock();
		try {
			while(!Objects.isNull(this.order)) {
					kanOrderKlaarZetten.await();			
			}
			
			this.order = order;
			kanOrderWegbrengen.signal();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		finally {
			accesLock.unlock();
		}
	}

	public Order haalOrderOp() {
		Order copy = null;
		accesLock.lock();
		try {
			while(Objects.isNull(order)) {
				kanOrderWegbrengen.await();
			}
			copy = order;
			order =null;
			kanOrderKlaarZetten.signal();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		finally {
			accesLock.unlock();
		}
		return copy;
	}

}
