package s10.test.command;

import java.util.ArrayList;

public class Waiter {
    private ArrayList<IOrder> ordersList = new ArrayList<>();

    public void noteOrder(IOrder command){
        this.ordersList.add(command);
    }

    public void sendOrder(){
        for(IOrder o:ordersList){
            o.processOrder();
        }
        ordersList.clear();
    }
}
