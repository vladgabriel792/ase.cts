package decorator;

public class ProgMain {
    public static void main(String[] args) {
        APizza pizzaBasic = new PizzaBasic();

        System.out.println("Pizza Basic: ");
        pizzaBasic.getIngredients();
        pizzaBasic.calculateCost();

        APizza aPizza = new DecoratorChickenPizza(pizzaBasic);
        System.out.println("\n------------\nPizza chicken: ");
        aPizza.getIngredients();
        aPizza.calculateCost();

    }
}
