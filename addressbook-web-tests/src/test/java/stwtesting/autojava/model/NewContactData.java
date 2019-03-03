package stwtesting.autojava.model;

public class NewContactData {
    private int id;
    private final String firstname;
    private final String secondname;
    private final String address;
    private final String email;
    private String group;


    public NewContactData(String firstname, String secondname, String address, String email, String group) {
        this.id = Integer.MAX_VALUE;
        this.firstname = firstname;
        this.secondname = secondname;
        this.address = address;
        this.email = email;
        this.group = group;
    }

    public NewContactData(int id, String firstname, String secondname, String address, String email, String group) {
        this.id = id;
        this.firstname = firstname;
        this.secondname = secondname;
        this.address = address;
        this.email = email;
        this.group = group;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getGroup() {
        return group;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "NewContactData{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewContactData that = (NewContactData) o;

        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (secondname != null ? !secondname.equals(that.secondname) : that.secondname != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        return group != null ? group.equals(that.group) : that.group == null;
    }

    @Override
    public int hashCode() {
        int result = firstname != null ? firstname.hashCode() : 0;
        result = 31 * result + (secondname != null ? secondname.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (group != null ? group.hashCode() : 0);
        return result;
    }

}
