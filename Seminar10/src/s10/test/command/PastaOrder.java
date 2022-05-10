package s10.test.command;

public class PastaOrder implements IOrder {
    private String typePasta;
    private Chief chief;


    public PastaOrder(String typePasta, Chief chief) {
        this.typePasta = typePasta;
        this.chief = chief;
    }

    public String getTypePasta() {
        return typePasta;
    }

    public void setTypePasta(String typePasta) {
        this.typePasta = typePasta;
    }

    public Chief getChief() {
        return chief;
    }

    public void setChief(Chief chief) {
        this.chief = chief;
    }

    @Override
    public void processOrder() {
        this.chief.cookPasta(this.typePasta);
    }
}
