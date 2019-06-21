package base.jdi.enums;

public enum UserName {
    PETER_CHAILOVSKII ("epam", "1234", "PETER_CHAILOVSKII");

    private final String login;
    private final String password;
    private final String userName;

    UserName(String login, String password, String userName) {
        this.login = login;
        this.password = password;
        this.userName = userName;
    }

    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public String getuserName() {
        return userName;
    }

}
