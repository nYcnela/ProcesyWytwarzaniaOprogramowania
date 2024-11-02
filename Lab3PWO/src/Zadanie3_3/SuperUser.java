package Zadanie3_3;

public class SuperUser extends User {
    private double[] permissions;

    public SuperUser(String userName, String login, String pwd) {
        super(userName, login, pwd);
    }

    public void setPermissions(double[] perms) {
        this.permissions = perms;
    }

    public double[] getPermissions() {
        return this.permissions;
    }
}
