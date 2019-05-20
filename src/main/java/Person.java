import Classes.Lessons;

public class Person {

    private String name;
    private String surname;
    private Lessons subject;
    private String email;

    Person(String name, String surname, Lessons subject, String email){
        this.name = name;
        this.surname = surname;
        this.subject = subject;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Lessons getSubject() {
        return subject;
    }

    public String getEmail() {
        return email;
    }
}
