package Classes;

import static Classes.Person.*;

public class Subjects {

    private String name = getName();
    private String surname = getSurname();
    private String email = getEmail();
    private Lessons lessons = getLessons();

Teacher teacher = new Teacher(name ,surname, email, lessons);
Learners learners = new Learners(name ,surname, email, lessons);


public String classLessons(){


    return "";
}

}
