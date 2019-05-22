package Classes;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LearnersTest {

    @Test
    public void ShouldTestIfLearnerQualified(){
        Learners learners = new Learners("Yegan", "Price","Yegan@gmail.com", Lessons.valueOf("Afrikaans"));

        learners.setLessons(Lessons.valueOf("History"));
        learners.setLessons(Lessons.valueOf("Biology"));


        assertEquals("Yegan valued!", learners.qualifiedPerson());
    }
    @Test
    public void ShouldTestIfLearnerIsNotQualified(){
        Learners learners = new Learners("Nathri","Hacker","Nat@hack.co.za", Lessons.valueOf("Mathematics"));


        assertEquals("Nathri valued!", learners.qualifiedPerson());
    }
    @Test
    public void ShouldTestIfLearnerHasBeenStored(){
        Learners learners = new Learners("Funky","Noodle","Foodle@gmail.com",Lessons.valueOf("English"));

        learners.setLessons(Lessons.valueOf("Afrikaans"));
        learners.setLessons(Lessons.valueOf("History"));

        assertEquals("new learner added: Funky", learners.setPerson());
        assertEquals("Funky added", learners.setPerson());
        assertEquals("Funky valued!", learners.qualifiedPerson());

    }


    @Test
    public void ShouldTestIfNewLearnerStored(){
        Learners learners = new Learners("Ntando","Amigo","Tido@gmail.com",Lessons.valueOf("English"));

        learners.setLessons(Lessons.valueOf("History"));
        learners.setLessons(Lessons.valueOf("Biology"));
        learners.setLessons(Lessons.valueOf("Mathematics"));



        assertEquals("new learner added: Ntando", learners.setPerson());
        assertEquals("Lesson Added", learners.storeLessons());
    }
}
