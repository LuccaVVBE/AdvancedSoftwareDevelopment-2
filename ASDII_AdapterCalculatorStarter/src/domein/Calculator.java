package domein;

import calcLibrary.CalculatorLibrary;
import calcLibrary.TargetDouble;

public class Calculator {

	private TargetDouble targetDouble;
	
	public Calculator(int i, int j) {
		// TODO Auto-generated constructor stub
		targetDouble = new CalculatorLibrary(i, j);
		;
	}

	public long add() {
		// TODO Auto-generated method stub
		return (long) targetDouble.add();
		
	}	
	

}
