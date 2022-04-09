public class User {

    private String name;
    private String lastName;
    private String email;
    private String Password;
    private boolean isGuestAccount;

    public User(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        Password = password;
        this.isGuestAccount = false;
    }

    public User(String email) {
        this.email = email;
        this.isGuestAccount = true;
    }

    public User(User user, String name, String lastName, String password) {
        if(user.isGuestAccount) {
            this.name = name;
            this.lastName = lastName;
            this.email = user.email;
            Password = password;
            this.isGuestAccount = false;
        }
    }

}