package solid.o.resolved;

public abstract class Employee {
    private int ID;
    private String name;
    private float salary;


    public Employee(){};
    public Employee(int ID, String name, float salary){
        super();
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public abstract float calculateBonus();
}
