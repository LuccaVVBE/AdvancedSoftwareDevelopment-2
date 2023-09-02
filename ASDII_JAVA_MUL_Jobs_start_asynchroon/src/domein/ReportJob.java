package domein;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ReportJob<T> implements Runnable {
	
	private Future<T> callableUitThreadPool;
	private GatherResult<T>  gatherResult;
	
	public ReportJob(Future<T> future, GatherResult<T> gr) {
		this.callableUitThreadPool=future;
		this.gatherResult=gr;
	}
	
	
	@Override
	public void run() {
		try {
			gatherResult.addResult(callableUitThreadPool.get());

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
