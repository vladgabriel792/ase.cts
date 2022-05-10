package s10.test.command;

public class Chief {
    private String name;

    public Chief(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void cookPizza(String type){
        System.out.println("The chef " + this.name +  "is cooking pizza " + type);
    }

    public void cookPasta(String type){
        System.out.println("The chef " + this.name +  "is cooking pasta " + type);
    }


}
