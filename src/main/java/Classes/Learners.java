package Classes;

import java.util.HashMap;
import java.util.Map;

class Learners extends Person {
        private static Map<String, Integer> lessonStored = new HashMap<>();
        static Map<String, Integer> learnerStored = new HashMap<>();

    Learners(String name, String surname, String email, Subjects subjects) {
        super(name, surname, email, subjects);
    }


    String storeLessons() {
        try {
            if (!lessonStored.containsKey(getSubjects().toString())) {
                lessonStored.put(getSubjects().toString() , 0);
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
                learnerStored.put(getName(), 0);
                return "new learner added: " + getName();
            }
            if (learnerStored.containsKey(getName())) {
                int counterForUser = learnerStored.get(getName());
                counterForUser++;
                learnerStored.put(getName(), counterForUser);
                return getName() + " added";
            }
        } catch (Exception ex) {
            return "fail!";
        }
        return "";
    }
    boolean qualifiedPerson() {
        int mapSize = lessonStored.size();
        try {
            return mapSize <= 3;
        } catch (Exception ex) {
            return false;
        }
    }
    String getLearnerName(){
        return getName();
    }
}