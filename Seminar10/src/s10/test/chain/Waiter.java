package s10.test.chain;

public class Waiter extends AHandler{

    @Override
    public void processOrder(Order o) {
        if (o.getDifficulty() > 5){
            System.out.println("Waiter can't handle this.");
            this.successor.processOrder(o);
        }
        else{
            System.out.println("Waiter is handling this: " + o.getName());
        }
    }
}
