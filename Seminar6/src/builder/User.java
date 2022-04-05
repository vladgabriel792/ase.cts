package builder;

public class User {

    //mandatory
    String username;
    String password;
    String email;

    // optional
    String address;
    String phoneNo;
    String birthday;

    public User(String username, String password, String email, String address, String phoneNo, String birthday) {
        super();
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
        this.phoneNo = phoneNo;
        this.birthday = birthday;
    }
    public User(String username, String password, String email, String address) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
    }
}
