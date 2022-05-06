package solid.d2;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calculator = new Calculator();
		SubtractNumbers s = new SubtractNumbers();
		calculator.calculate(10, 15, Operation.ADD);
		calculator.calculate(10, 15, s);
	}

}
