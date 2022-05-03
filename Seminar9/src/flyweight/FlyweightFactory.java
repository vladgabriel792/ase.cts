package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<ReceiptEnum,Receipt> listReceipt = new HashMap<ReceiptEnum,Receipt>();

    public static  Receipt getReceipt(ReceiptEnum type){

        Receipt receipt = new Receipt(type);
        listReceipt.put(type, receipt);
        return receipt;

//        switch (type){
//            case type: {
//
//            }
//            default: {
//                throw new IllegalArgumentException("Unexpected value: " + type)
//            }
//        }

    }

    public static int getNoReceipt(){
        return listReceipt.size();
    }

}
