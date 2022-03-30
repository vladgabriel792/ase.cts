package solid.o.resolved;

public class FteEmployee extends Employee{


    public FteEmployee(int ID, String name, float salary) {
        super(ID, name, salary);

    }

    @Override
    public float calculateBonus() {
        return this.getSalary()*.1f;
    }
}
