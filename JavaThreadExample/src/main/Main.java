package main;

public class Main {

	public static void main(String[] args) {
		new Main().run();

	}
	
	private void run() {
		System.out.println("Main started");
		System.out.println(Thread.currentThread().getName());
		new Thread(()->{
			System.out.println("Hello, I'm a thread");
			System.out.println(Thread.currentThread().getName());
		}).start();
		
		System.out.println("Main ended");
	}

}
