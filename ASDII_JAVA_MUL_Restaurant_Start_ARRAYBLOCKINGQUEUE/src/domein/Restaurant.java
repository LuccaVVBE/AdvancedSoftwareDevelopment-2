package domein;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Restaurant {
	
	//private Order order;
//	private Lock accesLock = new ReentrantLock();
//	private Condition kanOrderWegbrengen = accesLock.newCondition();
//	private Condition kanOrderKlaarZetten = accesLock.newCondition();
//	
	private BlockingQueue<List<Order>> buffer = new ArrayBlockingQueue<>(1);

	public void zetOrderKlaar(Order order) {
//		accesLock.lock();
//		try {
//			while(!Objects.isNull(this.order)) {
//					kanOrderKlaarZetten.await();			
//			}
//			
//			this.order = order;
//			kanOrderWegbrengen.signal();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			Thread.currentThread().interrupt();
//		}
//		finally {
//			accesLock.unlock();
//		}
		try {
			buffer.put(order);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Order haalOrderOp() {
//		Order copy = null;
//		accesLock.lock();
//		try {
//			while(Objects.isNull(order)) {
//				kanOrderWegbrengen.await();
//			}
//			copy = order;
//			order =null;
//			kanOrderKlaarZetten.signal();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			Thread.currentThread().interrupt();
//		}
//		finally {
//			accesLock.unlock();
//		}
//		return copy;
		try {
			return buffer.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
