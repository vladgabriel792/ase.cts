package eu.ase.acs.solid.o;

public class ProgMain {

    public static void main(String[] args){
        Employee emJohn = new Employee(1, "John", 1500,"FTE");
        Employee emMichael = new Employee(2, "John", 1500,"Vendor");
//        emJohn.calculateBonus();
        System.out.println(emJohn.toString() + " BONUS: " + emJohn.calculateBonus());
        System.out.println(emMichael.toString() + " BONUS: " + emMichael.calculateBonus());
    }
}
