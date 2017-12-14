public class User extends Person {

    protected boolean admin;

    public User(){

    }

    public User(boolean admin) {
        this.admin = admin;
    }

    public User(String firstName, String lastName, boolean admin) {
        super(firstName, lastName);
        this.admin = admin;
    }

    public boolean isAdmin() {
        return admin;
    }
}
