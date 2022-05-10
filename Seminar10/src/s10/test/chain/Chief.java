package s10.test.chain;

public class Chief extends AHandler{
    @Override
    public void processOrder(Order o) {
        if(o.getDifficulty() > 5)
        {
            System.out.println("The Chief is handling this: " + o.getName());
        }
    }
}
