package eu.ase.acs.solid.o.resolved;

public class ProgMain {

    public static void main(String[] args){
        Employee emJohn= new FteEmployee(1,"John",2000);
        System.out.println(emJohn.toString()+" BONUS: " + emJohn.calculateBonus());
        Employee emMichael= new VendorEmployee(1,"John",2000);
        System.out.println(emMichael.toString()+" BONUS: " + emMichael.calculateBonus());

    }
}
