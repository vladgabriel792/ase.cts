package memento;

public class ProgMain {

    public static void main(String[] args) {
        ManagerVersion careTaker = new ManagerVersion();
        Contract originalContract = new Contract("Vlad");
        originalContract.addClause("increase salary 14%");
        careTaker.addVersion(originalContract.saveVersion());
        System.out.println("\n\n" + originalContract);
        originalContract.addClause("note period changed"); //v2
        careTaker.addVersion(originalContract.saveVersion());
//        System.out.println(originalContract);
        originalContract.addClause("manager - note period changed");
        careTaker.addVersion(originalContract.saveVersion());

        ContractVersion desiredVersion = careTaker.recoveryVersionContract(0);
        System.out.println(careTaker.recoveryVersionContract(0).getClauseVersion());
        originalContract.restoreFromVersion(desiredVersion);
    }


}
