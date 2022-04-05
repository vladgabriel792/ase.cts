package builderSolved;

public class User {

    //mandatory
    String username;
    String password;
    String email;

    // optional
    String address;
    String phoneNo;
    String birthday;

    public User(UserBuilder ub) {
        super();
        this.username = ub.username;
        this.password = ub.password;
        this.email = ub.email;
        this.address =ub.address;
        this.phoneNo = ub.phoneNo;
        this.birthday = ub.birthday;
    }

    public static class UserBuilder{
        // mandatory
        String username;
        String password;
        String email;

        // optional
        String address;
        String phoneNo;
        String birthday;

        UserBuilder(String username, String password, String email)  {
            this.username = username;
            this.password =password;
            this.email = email;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public UserBuilder setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;

        }
    }
}
