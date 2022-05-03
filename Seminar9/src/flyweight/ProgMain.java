package flyweight;

public class ProgMain {
    public static void main(String[] args) {
        Receipt[] list = new Receipt[50];
        ReceiptData[] listReceiptData = new ReceiptData[50];

        for (int i = 0 ; i <50 ; i ++)
        {
            list[i] = FlyweightFactory.getReceipt(ReceiptEnum.valueOf("FORMAT" + (i%3 + 1)));

            listReceiptData[i] = new ReceiptData(100+i);
        }
        for(int i = 0 ; i < 50 ; i++){
            list[i].printReceipt(listReceiptData[i]);
        }

        System.out.println(FlyweightFactory.getNoReceipt());
    }
}
