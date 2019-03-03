package stwtesting.autojava.model;

public class NewContactData {
    private int id;
    private String firstname;
    private String secondname;
    private String address;



    private String email;
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

    public NewContactData withId(int id) {
        this.id = id;
        return this;
    }

    public NewContactData withFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public NewContactData withSecondname(String secondname) {
        this.secondname = secondname;
        return this;
    }

    public NewContactData withAddress(String address) {
        this.address = address;
        return this;
    }

    public NewContactData withEmail(String email) {
        this.email = email;
        return this;
    }

    public NewContactData withGroup(String group) {
        this.group = group;
        return this;
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
