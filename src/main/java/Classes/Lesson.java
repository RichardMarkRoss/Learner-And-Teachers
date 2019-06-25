package Classes;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static Classes.Learners.learnerStored;
import static Classes.Teacher.teacherStored;

class Lesson {

    private Map<String, Integer> teacherTokens = new HashMap<>();
    private Map<String, Integer> studentTokens = new HashMap<>();
//    public Map<String, Integer> lessonHeld = new HashMap<>();


    private Teacher teacher;
    private Learners learners;

    Lesson(Teacher teacher, Learners learner, LocalDate now){
        this.teacher = teacher;
        this.learners = learner;
    }


    String teacherForLesson() {
        try {
            if (this.teacher.qualifiedPerson().equals(true)) {
                return String.valueOf(this.teacher.getTeacherName());
            }
            return "Teacher not qualified for lesson";
        } catch (Exception ex) {
            return "fail!";
        }
    }

    String learnerForLesson() {
        try {
            if (learnerStored.size() >= 3 && teacherForLesson().equals(teacher.getTeacherName())) {
                return "lesson can be learnt";
            }
            return "lesson can not be taught";
        } catch (Exception ex) {
            return "fail!";
        }
    }

    int teacherTokens() {
        int value = 0;
        try {
            if (teacherStored.containsKey(teacher.getTeacherName())) {
                this.teacherTokens.put(teacher.getTeacherName(), 5);
            } else
                for (HashMap.Entry<String, Integer> entry : teacherTokens.entrySet()) {
                    value = entry.getValue();
                }
        } catch (Exception ex) {
            return 0;
        }
        return value;
    }

    int learnerTokens() {
        int value = 0;
        try {
            if (learnerStored.containsKey(learners.getLearnerName())) {
                this.studentTokens.put(learners.getLearnerName(), 5);
            } else
                for (HashMap.Entry<String, Integer> entry : studentTokens.entrySet()) {
                    value = entry.getValue();
                }
        } catch (Exception ex) {
            return 0;
        }
        return value;
    }
}


//                (using hashmap interger to store teacher tokens)
//                int counterForUser = learnerStored.get(teacher.getTeacherName());
//                counterForUser = counterForUser + 5;
//                teacherStored.put(teacher.getTeacherName(), counterForUser);