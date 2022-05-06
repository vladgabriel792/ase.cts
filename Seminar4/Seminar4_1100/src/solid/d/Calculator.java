package solid.d;

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
}
