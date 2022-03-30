package singleton.v1;

public class Database {
    private static Database INSTANCE = new Database();

    private Database(){

    }

    public Database getInstance(){
        return INSTANCE;
    }


}
