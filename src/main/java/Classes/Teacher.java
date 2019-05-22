package Classes;

import java.util.HashMap;
import java.util.Map;

class Teacher extends Person {
    private Map<String, Integer> lessonStored = new HashMap<>();
    private Map<String, Integer> teacherStored = new HashMap<>();

       Teacher(String name, String surname, String email, Lessons lessons) {
        super(name, surname, email, lessons);
    }


    String storeLessons() {
        try {
            if (!lessonStored.containsKey(getLessons().toString())) {
                this.lessonStored.put(getLessons().toString() , 0);
                return "Lesson Added";
            }
            if (lessonStored.containsKey(getLessons().toString())) {
                return "Duplicate lesson";
            }
        } catch (Exception ex) {
            System.out.println("fail!");
        }
        return null;
    }


    String setPerson() {
        String name = getName();
        try {
            if (!teacherStored.containsKey(getName())) {
                this.teacherStored.put(name, 0);
                return "new learner added: " + getName();
            }
            if (teacherStored.containsKey(getLessons().toString())) {
                int counterForUser = this.teacherStored.get(name);
                counterForUser++;
                this.teacherStored.put(name, counterForUser);
                return getName() + " added";
            }
        } catch (Exception ex) {
            return "fail!";
        }
        return "";
    }


    String qualifiedPerson() {
        String username = getName();
        int mapSize = lessonStored.size();
        try {
            if (mapSize <= 2) {
                return username + " not valued!";
            }
            return username + " valued!";
        } catch (Exception ex) {
            return "fail!";
        }
    }
}
