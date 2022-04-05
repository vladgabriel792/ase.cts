package prototypeSolved;

import java.util.ArrayList;

public class BookShop implements Cloneable{
    private String name;
    private ArrayList<Book> listBooks = new ArrayList<Book>();

    public BookShop(String name, ArrayList<Book> listBooks) {
        this.name = name;
        this.listBooks = listBooks;
    }

    public BookShop() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListBooks(ArrayList<Book> listBooks) {
        this.listBooks = listBooks;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "name='" + name + '\'' +
                ", listBooks=" + listBooks +
                '}';
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getListBooks() {
        return listBooks;
    }

    public static BookShop loadDataFromDB(String name)
    {
        BookShop b = new BookShop();
        b.setName(name);
        Book book;
        for (int i = 0 ; i< 10; i++)
        {
            book = new Book(name + "  -" +i, "vlad", i*100);
            b.listBooks.add(book);
        }
        return  b;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        super.clone();
        BookShop bClone = new BookShop();
        bClone.name = this.name;
        bClone.listBooks = (ArrayList<Book>) this.listBooks.clone();
        return bClone;
    }
}
