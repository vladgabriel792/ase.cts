package decorator;

public class DecoratorPizza  extends  APizza{

    private APizza aPizza;

    public DecoratorPizza(APizza p)
    {
        this.aPizza = p;
    }


    @Override
    public void getIngredients() {
        aPizza.getIngredients();
    }

    @Override
    public void calculateCost() {
        aPizza.calculateCost();
    }
}
