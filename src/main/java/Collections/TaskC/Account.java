package Collections.TaskC;

public class Account {
    String nameAccount;
    String userName;
    String password;

    public Account(String nameAccount, String userName, String password) {
        this.nameAccount = nameAccount;
        this.userName = userName;
        this.password = password;

    }

    @Override
    public String toString() {
        return "Account{" +
                "nameAccount = " + nameAccount + ":" +
                "userName - " + userName + ", " +
                "password - " + password +
                '}';
    }

    public void delete(){
        this.nameAccount = null;
        this.userName = null;
        this.password = null;
    }
}