package Classes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeachersTest {
    @Test
    public void ShouldTestIfLearnerQualified(){
        Teacher teacher = new Teacher("Richard", "Ross", "richard@gmail.com", Subjects.valueOf("English"));
        teacher.setLessons(Subjects.valueOf("History"));
        teacher.setLessons(Subjects.valueOf("Biology"));


        assertEquals("Richard not valued!", teacher.qualifiedPerson());
    }
    @Test
    public void ShouldTestIfLearnerIsNotQualified(){
        Teacher teacher = new Teacher("Tabang", "Kiwi", "tabang@gmail.com", Subjects.valueOf("Mathematics"));
        assertEquals("Tabang not valued!", teacher.qualifiedPerson());
    }
    @Test
    public void ShouldTestIfLearnerHasBeenStored(){
        Teacher teacher = new Teacher("Andre","Pro","Andre@gmail.com", Subjects.valueOf("Biology"));
        teacher.setLessons(Subjects.valueOf("English"));
        teacher.setLessons(Subjects.valueOf("Afrikaans"));
        teacher.setLessons(Subjects.valueOf("History"));

        assertEquals("new learner added: Andre", teacher.setPerson());
        assertEquals("Andre not valued!", teacher.qualifiedPerson());

    }


    @Test
    public void ShouldTestIfNewLearnerStored(){
        Teacher teacher = new Teacher("Unalo","Killer","Unalo@gmail.com", Subjects.valueOf("Afrikaans"));

        teacher.setLessons(Subjects.valueOf("English"));
        teacher.setLessons(Subjects.valueOf("History"));
        teacher.setLessons(Subjects.valueOf("Biology"));
        teacher.setLessons(Subjects.valueOf("Mathematics"));



        assertEquals("new learner added: Unalo", teacher.setPerson());
        assertEquals("Lesson Added", teacher.storeLessons());
    }
}
