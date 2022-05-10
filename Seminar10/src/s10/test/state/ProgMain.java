package s10.test.state;

public class ProgMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setState(EState.WORKING);

        employee.perform("UX bug");
        employee.setState(EState.VACATION);
        employee.perform("server down");

    }
}
