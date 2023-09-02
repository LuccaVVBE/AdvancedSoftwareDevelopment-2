package domein;

import javafx.beans.value.ChangeListener;

public class DomeinController {
	
	private TellerThread tellerThread;
	private Thread activeThread;
	
	public DomeinController() {
		init();
	}
	
	public void addObserver(ChangeListener<? super Number> listener) {
		tellerThread.addObserver(listener);
	}
	
	public void resume() {
		tellerThread.resume();
	}
	
	public void suspend() {
		tellerThread.suspend();	
	}
	
	public void stop() {
		tellerThread.stop();
		resume();
	}

	public void reset() {
		// TODO Auto-generated method stub	
		stop();
		while(activeThread.isAlive()) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		init();
	}
	
	private void init() {
		tellerThread = new TellerThread();
		activeThread = new Thread(tellerThread);
		activeThread.start();
	}
}
