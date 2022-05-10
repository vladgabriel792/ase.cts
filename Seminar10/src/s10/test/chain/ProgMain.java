package s10.test.chain;

public class ProgMain {
    public static void main(String[] args) {
        Order o1 = new Order("Pizza",15);
        Order o2 = new Order("Coffee",3);

        AHandler waiter = new Waiter();
        AHandler chief = new Chief();


        waiter.setSuccessor(chief);
        waiter.processOrder(o1);
        waiter.processOrder(o2);
    }
}
