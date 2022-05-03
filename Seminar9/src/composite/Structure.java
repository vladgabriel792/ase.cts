package composite;

import java.util.ArrayList;

public class Structure extends ANode{
//    private ArrayList<ANode> list = new ArrayList<ANode>();
    private ArrayList<ANode> list = new ArrayList<ANode>();
    String nameStructure = " ";

    public Structure(String nameStructure) {
        super();
        this.nameStructure = nameStructure;
    }

    @Override
    public String getName() {
        return this.nameStructure;
    }


    @Override
    public float getPrice() {
        throw new UnsupportedOperationException();
    }
    // missing getPrice in case of a structure ( when the node is not a leaf )


    @Override
    public String getInfo() {
//        return super.getInfo();
        String info = " " + this.nameStructure;
        for(ANode node:list)
        {
            info +=  " " +  node.getInfo() + "\n" ;
        }
        return info;
    }

    @Override
    public void addNode(ANode elem) throws Exception {
//        super.addNode(elem);

        list.add(elem);
    }

    @Override
    public void removeNode(ANode elem) throws Exception {
//        super.removeNode(elem);
        list.remove(elem);
    }

    @Override
    public ANode getNode(int index) throws Exception {
//        return super.getNodde(index);
        return list.get(index);
    }
}
