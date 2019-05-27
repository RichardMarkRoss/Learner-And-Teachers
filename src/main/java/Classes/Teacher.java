package Classes;

import java.util.HashMap;
import java.util.Map;

class Teacher extends Person {
     Map<String, Integer> lessonStored = new HashMap<>();
     static Map<String, Integer> teacherStored = new HashMap<>();

       Teacher(String name, String surname, String email, Subjects subjects) {
           super(name, surname, email, subjects);
    }

    String storeLessons() {
        try {
            if (!lessonStored.containsKey(getSubjects().toString())) {
                this.lessonStored.put(getSubjects().toString() , 0);
                return "Lesson Added";
            }
            if (lessonStored.containsKey(getSubjects().toString())) {
                return "Duplicate lesson";
            }
        } catch (Exception ex) {
            System.out.println("fail!");
        }
        return "lesson not added";
    }


    String setPerson() {
        String name = getName();
        try {
            if (!teacherStored.containsKey(getName())) {
                teacherStored.put(name, 0);
                return "new learner added: " + getName();
            }
            if (teacherStored.containsKey(getSubjects().toString())) {
                int counterForUser = teacherStored.get(name);
                counterForUser++;
                teacherStored.put(name, counterForUser);
                return getName() + " added";
            }
        } catch (Exception ex) {
            return "fail!";
        }
        return "";
    }


     Boolean qualifiedPerson() {
        int mapSize = lessonStored.size();
        try {
            if (mapSize <= 2) {
                return true;
            }
            return false;
        } catch (Exception ex) {
            return false;
        }
    }

    public String getTeacherName(){
        return getName();
    }
    public Subjects getTeacherLesson(){
           return getSubjects();
    }
}

