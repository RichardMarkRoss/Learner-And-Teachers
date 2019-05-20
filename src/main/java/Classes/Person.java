package Classes;

public class Person {
    private String name;
    private String surname;
    private String email;
    private Lessons lessons;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
            this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setLessons(Lessons lessons) {
        this.lessons = lessons;
    }

    public Lessons getLessons() {
        return lessons;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public String getEmail() {
        return email;
    }
}
