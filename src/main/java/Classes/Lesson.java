package Classes;

import java.util.HashMap;

import static Classes.Learners.learnerStored;
import static Classes.Learners.lessonStored;
import static Classes.Person.getName;
import static Classes.Person.getSubjects;
import static Classes.Teacher.teacherStored;

public class Lesson {

    Teacher teacher;
    Learners learners;

    String teacherForLesson() {
        try {
            if (teacher.qualifiedPerson().equals(true)) {
                return String.valueOf(teacher.getTeacherName());
            }
            return "Teacher not qualified for lesson";
        } catch (Exception ex) {
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

    public int teacherTokens() {
        int value = 0;
        try {
            if (teacherStored.containsKey(teacher.getTeacherName())) {
                int counterForUser = learnerStored.get(teacher.getTeacherName());
                counterForUser = counterForUser + 5;
                teacherStored.put(teacher.getTeacherName(), counterForUser);
                for (HashMap.Entry<String, Integer> entry : teacherStored.entrySet()) {
                    value = entry.getValue();
                }
            }
        } catch (Exception ex) {
            return 0;
        }
        return value;
    }
}
