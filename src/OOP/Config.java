package OOP;

public class Config {
    private String username;
    private String password;

    public Config(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public static void main(String[] args) {
        Config config = new Config("test", "test123");

        config.username = "tester";
        config.password = "password";
    }

}