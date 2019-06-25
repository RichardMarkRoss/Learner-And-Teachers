package Classes;

import java.util.HashMap;
import java.util.Map;

class Teacher extends Person {
    private Map<String, Integer> lessonStored = new HashMap<>();
    static Map<String, Integer> teacherStored = new HashMap<>();

    Teacher(String name, String surname, String email, Subjects subjects) {
        super(name, surname, email, subjects);
    }

    String storeLessons() {
        try {
            if (!lessonStored.containsKey(getSubjects().toString())) {
                this.lessonStored.put(getSubjects().toString(), 1);
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


    String storePerson() {
        try {
            if (!teacherStored.containsKey(getName())) {
                teacherStored.put(getName(), 1);
                return "new teacher added";
            }
            return "Update teacher";
        } catch (Exception ex) {
            return "fail!";
        }
    }


    Boolean qualifiedPerson() {
        int mapSize = lessonStored.size();
        try {
            return mapSize <= 2;
        } catch (Exception ex) {
            return false;
        }
    }


    String getTeacherName() {
        String key = "failed!";
        try {
            for (HashMap.Entry<String, Integer> entry : teacherStored.entrySet()) {
                return entry.getKey();
            }
            return key;
        }catch(Exception ex){
            return "error occurred!";
        }
    }
}
