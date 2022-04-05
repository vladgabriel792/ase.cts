package prototypeSolved;

public class ProgMain {
    public static void main(String[] args) {
        BookShop carturesti = BookShop.loadDataFromDB("carturesti");
        System.out.println(carturesti);

        BookShop diverta = null;

        try {
            diverta = (BookShop) carturesti.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        diverta.getListBooks().remove(2);

        System.out.println("DEEP COPY");
        System.out.println(carturesti);
    }
}
