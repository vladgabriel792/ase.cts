package flyweight;

public class Receipt implements  IReceipt{

    private ReceiptEnum receiptType;

    public Receipt(ReceiptEnum receiptType) {
        this.receiptType = receiptType;
    }

    @Override
    public void printReceipt(ReceiptData data) {
        System.out.println("This receipt is " + this.receiptType + " with price: " + data.getPrice());
    }

    public ReceiptEnum getReceiptTypes(){
        return receiptType;
    }
}
