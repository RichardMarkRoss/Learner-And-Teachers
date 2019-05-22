package Classes;

public class Person {
    private static String name;
    private static String surname;
    private static String email;
    private static Lessons lessons;

    Person(String name, String surname, String email, Lessons lessons){
        Person.name = name;
        Person.surname = surname;
        Person.email = email;
        Person.lessons = lessons;
    }

    void setLessons(Lessons lessons) {
        Person.lessons = lessons;
    }

    static Lessons getLessons() {
        return lessons;
    }

    static String getName() {
        return name;
    }

    static String getSurname() {
        return surname;
    }

    static String getEmail() {
        return email;
    }
}




//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
