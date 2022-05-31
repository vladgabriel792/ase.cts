package mock;

import interfaces.IPerson;

public class PersonMock implements IPerson {
    private String name;
    private String personalNumber;
    private int age;
    private double[] costsReceipts;

    public PersonMock() {
//        this.name = "name";
//        this.personalNumber = "personalNumber";
//        this.age = 18;
    }

    public String getName() {
//        return name;
        return "name";
    }

    public String getPersonalNumber() {
//        return personalNumber;
        return "personalNumber";
    }

    public int getAge() {
//        return age;
        return 18;
    }

    public double[] getCostsReceipts() {
        return costsReceipts;
    }

    @Override
    public double getAverageCosts() throws Exception {
        return (Double) null;
    }
}
