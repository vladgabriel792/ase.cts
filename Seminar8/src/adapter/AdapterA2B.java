package adapter;

public class AdapterA2B extends DiscountB implements IDiscountA{
    @Override
    public double calculateDiscountA(int value) {
//        IN acest caz nu se poate adapta :)
        return 0;
    }
}
