package composite;

import java.util.ArrayList;

// LEAF //

public class Node extends ANode{

    private String name;
    private float price;

    public Node(String Name, float Price) {
        super();
        this.name = Name;
        this.price = Price;
    }

    ////////

    @Override
    public String getName() {
//        return this.getName();
        return this.name;
    }

    @Override
    public float getPrice() {
//        return this.getPrice();
        return this.price;
    }


}
