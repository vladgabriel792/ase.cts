package decorator;

public class DecoratorChickenPizza extends DecoratorPizza{

    public DecoratorChickenPizza(APizza p){
        super(p);
    }
    @Override
    public void getIngredients() {
        super.getIngredients();
        System.out.println("+ chicken");
    }

    @Override
    public void calculateCost() {
        super.calculateCost();
        System.out.print("+ $10 (chicken)");
    }
}
