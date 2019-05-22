package Classes;

import java.util.HashMap;
import java.util.Map;

public class Learners extends Person {
    private Map<String, Integer> lessonStored = new HashMap<String, Integer>();
    private Map<String, Integer> learnerStored = new HashMap<String, Integer>();

    public Learners(String name, String surname, String email, Lessons lessons) {
        super(name, surname, email, lessons);
    }


    public String storeLessons() {
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
        return "";
    }
    public String setPerson() {
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
    public String qualifiedPerson() {
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