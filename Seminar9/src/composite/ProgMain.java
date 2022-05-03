package composite;

public class ProgMain {
    public static void main(String[] args) throws Exception{
        Structure menu = new Structure("Menu"); // radacina

        Structure menuDrinks = new Structure("Drinks");
        Structure menuFood = new Structure("Food");

        menu.addNode(menuDrinks);
        menu.addNode(menuFood);

        Structure AlcMenu = new Structure("AlcMenu");
        Structure NonAlcMenu = new Structure("NonAlcMenu");

        menuDrinks.addNode(AlcMenu);
        menuDrinks.addNode(NonAlcMenu);


        Node pizzaCarbonara = new Node("Pizza Caarbonara", 25);
        menuFood.addNode(pizzaCarbonara);
        menuFood.addNode(new Node("pasta Carbonara",27));

        System.out.println(menu.getInfo());

    }
}
