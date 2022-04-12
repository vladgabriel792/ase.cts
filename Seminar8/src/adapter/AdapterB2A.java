package adapter;

public class AdapterB2A extends DiscountA implements IDiscountB {

    @Override
    public double calculateDiscountB(Client client) {
        System.out.println("Method B2");
//        this.calculateDiscountA(client.getNrOrder());
//        return 0;

        // v2
        int total = 0;
        for(int i = 0; i< client.getNrOrder(); i++)
        {
            total += client.getOrders()[i];
        }
        this.calculateDiscountA(total);
        return 0;
    }
}
