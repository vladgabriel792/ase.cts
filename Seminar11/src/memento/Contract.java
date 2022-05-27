package memento;

public class Contract {
    private String clientName;
    private String clauseContract;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClauseContract() {
        return clauseContract;
    }

    public void setClauseContract(String clauseContract) {
        this.clauseContract = clauseContract;
    }

    public Contract(String clientName) {
        this.clientName = clientName;
    }

    public Contract(String clientName, String clauseContract) {
        this.clientName = clientName;
        this.clauseContract = clauseContract;
    }

    public void addClause(String newClause)
    {
        this.clauseContract += "\n" + newClause;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "clientName='" + clientName + '\'' +
                ", clauseContract='" + clauseContract + '\'' +
                '}';
    }

    public void restoreFromVersion(ContractVersion clauseVersion)
    {
//        this.clauseContract = clauseVersion;
        this.clauseContract = clauseVersion.getClauseVersion();
    }

    public ContractVersion saveVersion()
    {
        System.out.println("Save version of the contract");
        return new ContractVersion(this.clauseContract);
    }

    // save version
}
