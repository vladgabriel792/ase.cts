package solid.d2;

public class Calculator {
	
	public void calculate(double a, double b, Operation op) {
			double result = 0;
			switch(op) {
			case ADD: {
				result = a + b;
				break;
			}
			case SUBSTRACT: {
				result = a - b;
				break;
			}
			case DIVIDE: {
				result = a / b;
				break;
			}
			default: {
				break;
			}
		}
	}	
	
	public void calculate(double a, double b, AddNumbers op) {
		double result = 0;
		result = a + b;
	}
	
	public void calculate(double a, double b, SubtractNumbers op) {
		double result = 0;
		result = a - b;
	}
}	

