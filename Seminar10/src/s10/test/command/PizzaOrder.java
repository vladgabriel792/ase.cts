package s10.test.command;

public class PizzaOrder implements IOrder{
    private Chief chief;
    private String typePizza;

    public PizzaOrder(Chief chief, String typePizza) {
        this.chief = chief;
        this.typePizza = typePizza;
    }

    public Chief getChief() {
        return chief;
    }

    public void setChief(Chief chief) {
        this.chief = chief;
    }

    public String getTypePizza() {
        return typePizza;
    }

    public void setTypePizza(String typePizza) {
        this.typePizza = typePizza;
    }

    @Override
    public void processOrder() {
        this.chief.cookPizza(this.typePizza);
    }
}
