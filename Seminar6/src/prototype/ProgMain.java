package prototype;

public class ProgMain {
    public static void main(String[] args) {
        BookShop carturesti = BookShop.loadDataFromDB("carturesti");
        System.out.println(carturesti);

        BookShop diverta = carturesti;
        diverta.getListBooks().remove(2);
        System.out.println(carturesti);
    }
}
