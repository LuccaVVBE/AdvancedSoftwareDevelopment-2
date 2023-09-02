package cui;

import java.util.Scanner;

import domein.DomeinController;

public class Console {

	private DomeinController dc;

	public Console(DomeinController domeinController) {
		// TODO Auto-generated constructor stub
		dc = domeinController;
	}
	
	public void run() {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			dc.runMethod(input.next());
		}
	}

}
