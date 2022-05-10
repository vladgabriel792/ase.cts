package s10.test.template;

public class InsuranceProcedure extends AInsuranceProcedure{
    @Override
    protected void identifyDamage() {
        System.out.println("I am identifying the problem");
    }

    @Override
    protected void evaluateDamage() {
        System.out.println("I am evaluating the problem");
    }

    @Override
    protected void sendInsurance() {
        System.out.println("Sending insurance...");
    }
}
