package memento;

// CLASS: "MEMENTO"
public class ContractVersion {
    private String clauseVersion;

    public ContractVersion(String clauseVersion) {
        this.clauseVersion = clauseVersion;
    }

    public ContractVersion() {
    }

    public String getClauseVersion() {
        return this.clauseVersion;
    }

    public void setClauseVersion(String clauseVersion) {
        this.clauseVersion = clauseVersion;
    }

}
