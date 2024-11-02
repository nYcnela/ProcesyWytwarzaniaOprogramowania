package Zadanie3_3;


public class User {
    public String userName;
    protected String login;
    private String pwdHash;

    UserService service;

    User(String userName, String login, String pwd){
        this.userName = userName;
        this.login = login;
        this.pwdHash = SHA256.hash(pwd);
    }
    public void logIn(String pwd){
        if(pwdHash.equals(SHA256.hash(pwd)))
            service.logIn(userName, pwdHash);
    }
    public void logOut(){
        service.logOut(userName);
    }
}
