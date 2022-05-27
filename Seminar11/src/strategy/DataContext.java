package strategy;

public class DataContext {
    // NOT A MANDATORY CLASS ; THIS OPERATIONS CAN BE DONE IN MAIN()

    private int [] values = null;
    private IStrategy strategy;

    public DataContext(int[] values, IStrategy strategy) {
        this.values = values;
        this.strategy = strategy;
    }

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public int processValue() {
        return this.strategy.process(this.values);
    }
}
