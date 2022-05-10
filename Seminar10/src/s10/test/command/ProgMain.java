package s10.test.command;

public class ProgMain {
    public static void main(String[] args) {
        Chief c1 = new Chief("Michael");
        Chief c2 = new Chief("Rose");

        Waiter waiter = new Waiter();

        waiter.noteOrder(new PizzaOrder(c1,"diavola"));
        waiter.noteOrder(new PastaOrder("carbonara",c2));
        waiter.noteOrder(new PizzaOrder(c1,"margherita"));

        waiter.sendOrder();

    }
}
