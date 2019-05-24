package Classes;

import java.util.HashMap;
import java.util.Map;

class Learners extends Person {
    private Map<String, Integer> lessonStored = new HashMap<>();
    private Map<String, Integer> learnerStored = new HashMap<>();

    Learners(String name, String surname, String email, Subjects subjects) {
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
        return "";
    }
    String setPerson() {
        try {
            if (!learnerStored.containsKey(getName())) {
                this.learnerStored.put(getName(), 0);
                return "new learner added: " + getName();
            }
            if (learnerStored.containsKey(getName())) {
                int counterForUser = this.learnerStored.get(getName());
                counterForUser++;
                this.learnerStored.put(getName(), counterForUser);
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
            if (mapSize > 3) {
                return username + " not valued!";
            }
            return username + " valued!";
        } catch (Exception ex) {
            return "fail!";
        }
    }
}