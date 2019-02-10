package stwtesting.autojava;

public class NewContactData {
    private final String firstname;
    private final String secondname;
    private final String username;
    private final String email;

    public NewContactData(String firstname, String secondname, String username, String email) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.username = username;
        this.email = email;
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
}
