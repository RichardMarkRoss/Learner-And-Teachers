package Classes;

class Person {
    private static String name;
    private static String surname;
    private static String email;
    private static Subjects subjects;

    Person(String name, String surname, String email, Subjects subjects){
        Person.name = name;
        Person.surname = surname;
        Person.email = email;
        Person.subjects = subjects;
    }

    void setLessons(Subjects subjects) {
        Person.subjects = subjects;
    }

    static Subjects getSubjects() {
        return subjects;
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
