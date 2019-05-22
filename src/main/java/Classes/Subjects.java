package Classes;

import static Classes.Person.*;

public class Subjects {

    String name = getName();
    String surname = getSurname();
    String email = getEmail();
    Lessons lessons = getLessons();

Teacher teacher = new Teacher(name ,surname, email, lessons);
Learners learners = new Learners(name ,surname, email, lessons);


public String classLessons(){


    return "";
}

}
