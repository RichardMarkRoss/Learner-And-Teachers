import Classes.Learners;
import Classes.Lessons;
import Classes.Teacher;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeachersTest {
    @Test
    public void ShouldTestIfLearnerQualified(){
        Teacher teacher = new Teacher();

        String name = "Richard";

        teacher.setName(name);
        teacher.setLessons(Lessons.valueOf("English"));
        teacher.setLessons(Lessons.valueOf("History"));
        teacher.setLessons(Lessons.valueOf("Biology"));


        assertEquals("Richard not valued!", teacher.qualifiedPerson());
    }
    @Test
    public void ShouldTestIfLearnerIsNotQualified(){
        Teacher teacher = new Teacher();

        String name = "Richard";

        teacher.setName(name);
        teacher.setLessons(Lessons.valueOf("English"));


        assertEquals("Richard not valued!", teacher.qualifiedPerson());
    }
    @Test
    public void ShouldTestIfLearnerHasBeenStored(){
        Teacher teacher = new Teacher();
        String name = "Richard";

        teacher.setName(name);
        teacher.setLessons(Lessons.valueOf("English"));
        teacher.setLessons(Lessons.valueOf("Afrikaans"));
        teacher.setLessons(Lessons.valueOf("History"));

        assertEquals("fail!", teacher.setPerson());
        assertEquals("fail!", teacher.setPerson());
        assertEquals("Richard not valued!", teacher.qualifiedPerson());

    }


    @Test
    public void ShouldTestIfNewLearnerStored(){
        Teacher teacher = new Teacher();

        String name = "Richard";

        teacher.setName(name);
        teacher.setLessons(Lessons.valueOf("English"));
        teacher.setLessons(Lessons.valueOf("History"));
        teacher.setLessons(Lessons.valueOf("Biology"));
        teacher.setLessons(Lessons.valueOf("Mathematics"));



        assertEquals("fail!", teacher.setPerson());
        assertEquals("Lesson Added", teacher.storeLessons());
    }
}
