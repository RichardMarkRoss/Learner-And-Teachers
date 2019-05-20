import Classes.Learners;
import Classes.Lessons;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LearnersTest {

    @Test
    public void ShouldTestIfLearnerQualified(){
        Learners learners = new Learners();

        String name = "Richard";

        learners.setName(name);
        learners.setLessons(Lessons.valueOf("English"));
        learners.setLessons(Lessons.valueOf("History"));
        learners.setLessons(Lessons.valueOf("Biology"));


        assertEquals("Richard valued!", learners.qualifiedPerson());
    }
    @Test
    public void ShouldTestIfLearnerIsNotQualified(){
        Learners learners = new Learners();

        String name = "Richard";

        learners.setName(name);
        learners.setLessons(Lessons.valueOf("English"));


        assertEquals("Richard valued!", learners.qualifiedPerson());
    }
    @Test
    public void ShouldTestIfLearnerHasBeenStored(){
        Learners learners = new Learners();
        String name = "Richard";

        learners.setName(name);
        learners.setLessons(Lessons.valueOf("English"));
        learners.setLessons(Lessons.valueOf("Afrikaans"));
        learners.setLessons(Lessons.valueOf("History"));

        assertEquals("new learner added: Richard", learners.setPerson());
        assertEquals("Richard added", learners.setPerson());
        assertEquals("Richard valued!", learners.qualifiedPerson());

    }


    @Test
    public void ShouldTestIfNewLearnerStored(){
        Learners learners = new Learners();

        String name = "Richard";

        learners.setName(name);
        learners.setLessons(Lessons.valueOf("English"));
        learners.setLessons(Lessons.valueOf("History"));
        learners.setLessons(Lessons.valueOf("Biology"));
        learners.setLessons(Lessons.valueOf("Mathematics"));



        assertEquals("new learner added: Richard", learners.setPerson());
        assertEquals("Lesson Added", learners.storeLessons());
    }
}
