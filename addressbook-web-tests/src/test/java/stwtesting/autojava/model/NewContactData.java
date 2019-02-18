package stwtesting.autojava.model;

public class NewContactData {
    private final String firstname;
    private final String secondname;
    private final String username;
    private final String email;
    private String group;

    public NewContactData(String firstname, String secondname, String username, String email, String group) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.username = username;
        this.email = email;
        this.group = group;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getGroup() {
        return group;
    }
}
