package solid.d3;

public class ProgMain {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		double res = c.caculate(10, 15, new AddNumbers());
		System.out.println(res);
	}

}
