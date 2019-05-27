package Classes;

import static Classes.Learners.learnerStored;

public class Lesson {

    Teacher teacher;
    Learners learners;

    String teacherForLesson() {
        try {
            if (teacher.qualifiedPerson().equals(true)) {
                return teacher.getTeacherName();
            }
            return "Teacher not qualified for lesson";
            //teacher not qualified for lesson
            //convert to string so you can test the method
        } catch (Exception ex) {
            System.out.println(ex.fillInStackTrace());
            return "fail!";
        }
    }

     String learnerForLesson() {
        try {
            if (learnerStored.size() >= 3 && teacherForLesson().equals(teacher.getTeacherName())) {
                //add tokens to the teacher;
                return "lesson can be learnt";
            }
            return "lesson can not be taught";
        } catch (Exception ex) {
            return "fail!";
        }
    }


}
