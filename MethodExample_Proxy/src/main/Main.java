package main;

import cui.Console;
import domein.DomeinController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

	private void run() {
		// TODO Auto-generated method stub
		new Console(new DomeinController()).run();
	}

}
