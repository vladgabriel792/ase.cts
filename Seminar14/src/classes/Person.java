package classes;

import interfaces.IPerson;

public class Person implements IPerson {
    private String name;
    private String personalNumber;
    private int age;
    private double[] costsReceipts;

    public Person() {
    }

    public Person(String name, String personalNumber, int age) {
        this.name = name;
        this.personalNumber = personalNumber;
        this.age = age;
    }

    public Person(String name, String personalNumber, int age, double[] costsReceipts) {
        this.name = name;
        this.personalNumber = personalNumber;
        this.age = age;
        this.costsReceipts = costsReceipts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getCostsReceipts() {
        return costsReceipts;
    }

    public void setCostsReceipts(double[] costsReceipts) {
        this.costsReceipts = costsReceipts;
    }

    @Override
    public double getAverageCosts() throws Exception {
        if(this.costsReceipts == null || this.costsReceipts.length == 0)
        {
            throw new Exception();
        }
        double sum=0;
        for (int i=0;i<this.costsReceipts.length;i++)
        {
            sum+=this.costsReceipts[i];
        }
        return sum/this.costsReceipts.length;
    }
}
