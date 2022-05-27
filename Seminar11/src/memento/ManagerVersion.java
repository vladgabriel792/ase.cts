package memento;

import java.util.ArrayList;

/// " CARE TAKER "
public class ManagerVersion {
    private ArrayList<ContractVersion> contractVersions = new ArrayList<ContractVersion>();

    public ManagerVersion() {
    }

    public ManagerVersion(ArrayList<ContractVersion> contractVersions) {
        this.contractVersions = contractVersions;
    }

    public void addVersion(ContractVersion newContractVersion )
    {
        this.contractVersions.add(newContractVersion);
    }

    public ContractVersion recoveryVersionContract(int nrVersion)
    {
        return this.contractVersions.get(nrVersion);
    }
}
