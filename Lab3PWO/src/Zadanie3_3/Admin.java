package Zadanie3_3;

public class Admin extends User {
    private boolean loggedIn = false;
    private double[] permissions;

    public Admin(String userName, String login, String pwd) {
        super(userName, "Admin" + login, pwd);
    }

    public void setPermissions(double[] perms) {
        this.permissions = perms;
    }

    public double getPermission(int index) {
        return permissions[index];
    }

    @Override
    public void logIn(String pwd) {
        super.logIn(pwd);
        loggedIn = true;
    }

    @Override
    public void logOut() {
        if (loggedIn) {
            service.logOut(userName);
            loggedIn = false;
        }
    }
}

