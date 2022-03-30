package solid.o.resolved;

public class VendorEmployee extends Employee{

    public VendorEmployee(int ID, String name, float salary) {
        super(ID, name, salary);
    }

    @Override
    public float calculateBonus() {
        return this.getSalary()*.05f;
    }
}
