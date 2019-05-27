package Classes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeachersTest {
    @Test
    public void ShouldTestIfTeacherQualified(){
        Teacher teacher = new Teacher("Richard", "Ross", "richard@gmail.com", Subjects.valueOf("English"));
        teacher.setLessons(Subjects.valueOf("History"));
        teacher.setLessons(Subjects.valueOf("Biology"));


        assertEquals(true, teacher.qualifiedPerson());
    }
    @Test
    public void ShouldTestIfTeacherIsNotQualified(){
        Teacher teacher = new Teacher("Tabang", "Kiwi", "tabang@gmail.com", Subjects.valueOf("Mathematics"));
        assertEquals(true, teacher.qualifiedPerson());
    }

    @Test
    public void ShouldTestIfTeacherDuplicateSubjects(){
        Teacher teacher = new Teacher("Richard", "Ross", "richard@gmail.com", Subjects.valueOf("History"));
        teacher.setLessons(Subjects.valueOf("History"));

        assertEquals("Lesson Added", teacher.storeLessons());
    }
    @Test
    public void ShouldTestIfTeacherHasBeenStored(){
        Teacher teacher = new Teacher("Andre","Pro","Andre@gmail.com", Subjects.valueOf("Biology"));
        teacher.setLessons(Subjects.valueOf("English"));
        teacher.setLessons(Subjects.valueOf("Afrikaans"));
        teacher.setLessons(Subjects.valueOf("History"));

        assertEquals("new teacher added", teacher.setPerson());
        assertEquals(true, teacher.qualifiedPerson());

    }
    @Test
    public void ShouldTestIfNewTeacherStored(){
        Teacher teacher = new Teacher("Unalo","Killer","Unalo@gmail.com", Subjects.valueOf("Afrikaans"));

        teacher.setLessons(Subjects.valueOf("English"));
        teacher.setLessons(Subjects.valueOf("History"));
        teacher.setLessons(Subjects.valueOf("Biology"));
        teacher.setLessons(Subjects.valueOf("Mathematics"));



        assertEquals("new teacher added", teacher.setPerson());
        assertEquals("Lesson Added", teacher.storeLessons());
    }
}
