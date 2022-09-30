package BT3;

public class Author {
    String name;
    String email;
    char gender;

    public Author() {
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public Character getGender() {
        return this.gender;
    }

    public String toString() {
        return String.format("Author[name=%s, email=%s, gender=%s]", getName(), getEmail(), getGender());
    }
}

