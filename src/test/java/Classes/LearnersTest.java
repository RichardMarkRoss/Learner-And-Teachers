package Classes;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LearnersTest {

    @Test
    public void ShouldTestIfLearnerQualified(){
        Learners learners = new Learners("Yegan", "Price","Yegan@gmail.com", Subjects.valueOf("Afrikaans"));

        learners.setLessons(Subjects.valueOf("History"));
        learners.setLessons(Subjects.valueOf("Biology"));


        assertTrue(learners.qualifiedPerson());
    }
    @Test
    public void ShouldTestIfLearnerIsNotQualified(){
        Learners learners = new Learners("Nathri","Hacker","Nat@hack.co.za", Subjects.valueOf("Mathematics"));


        assertTrue(learners.qualifiedPerson());
    }
    @Test
    public void ShouldTestIfLearnerHasBeenStored(){
        Learners learners = new Learners("Funky","Noodle","Foodle@gmail.com", Subjects.valueOf("English"));

        learners.setLessons(Subjects.valueOf("Afrikaans"));
        learners.setLessons(Subjects.valueOf("History"));

        assertEquals("new learner added: Funky", learners.setPerson());
        assertEquals("Funky added", learners.setPerson());
        assertTrue(learners.qualifiedPerson());

    }


    @Test
    public void ShouldTestIfNewLearnerStored(){
        Learners learners = new Learners("Ntando","Amigo","Tido@gmail.com", Subjects.valueOf("English"));

        learners.setLessons(Subjects.valueOf("History"));
        learners.setLessons(Subjects.valueOf("Biology"));
        learners.setLessons(Subjects.valueOf("Mathematics"));



        assertEquals("new learner added: Ntando", learners.setPerson());
        assertEquals("Lesson Added", learners.storeLessons());
    }
}
