package Classes;

import org.junit.Test;

//import static Classes.Subjects.valueOf;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class LessonsTest {
    @Test
    public void ShouldTestIfTeacherQualified(){

        Learners learners = new Learners("greg", "folks","greg@gmail.com", Subjects.Afrikaans);
        Teacher teacher = new Teacher("Richard", "Ross", "richard@gmail.com", Subjects.valueOf("English"));
        Lesson lesson = new Lesson(teacher, learners, LocalDate.now());

        teacher.setLessons(Subjects.valueOf("History"));
        teacher.setLessons(Subjects.valueOf("Biology"));
        teacher.setLessons(Subjects.valueOf("Sciences"));
        learners.setLessons(Subjects.valueOf("History"));
        learners.setLessons(Subjects.valueOf("Biology"));
        learners.setLessons(Subjects.valueOf("Sciences"));
        learners.setLessons(Subjects.valueOf("Mathematics"));



        assertEquals("fail!", lesson.teacherForLesson());
    }
    @Test
    public void ShouldTestIfLearnerQualified(){

        Learners learners = new Learners("greg", "folks","greg@gmail.com", Subjects.Afrikaans);
        Teacher teacher = new Teacher("Richard", "Ross", "richard@gmail.com", Subjects.valueOf("English"));
        Lesson lesson = new Lesson(teacher, learners, LocalDate.now());

        teacher.setLessons(Subjects.valueOf("History"));
        teacher.setLessons(Subjects.valueOf("Biology"));
        teacher.setLessons(Subjects.valueOf("Sciences"));
        learners.setLessons(Subjects.valueOf("History"));
        learners.setLessons(Subjects.valueOf("Biology"));
        learners.setLessons(Subjects.valueOf("Sciences"));
        learners.setLessons(Subjects.valueOf("Mathematics"));



        assertEquals("lesson can not be taught", lesson.learnerForLesson());
    }
    @Test
    public void ShouldTestIfTeacherTokensDemo(){
        Teacher teacher = new Teacher("Richard", "Ross", "richard@gmail.com", Subjects.valueOf("English"));
        Learners learners = new Learners("greg", "folks","greg@gmail.com", Subjects.Afrikaans);
        Lesson lesson = new Lesson(teacher, learners, LocalDate.now());

        teacher.setLessons(Subjects.valueOf("History"));
        teacher.setLessons(Subjects.valueOf("Biology"));
        teacher.setLessons(Subjects.valueOf("Sciences"));
        learners.setLessons(Subjects.valueOf("History"));
        learners.setLessons(Subjects.valueOf("Biology"));
        learners.setLessons(Subjects.valueOf("Sciences"));
        learners.setLessons(Subjects.valueOf("Mathematics"));



        assertEquals(0, lesson.teacherTokens());
    }
    @Test
    public void ShouldTestIfStudentsTokensDemo(){
        Teacher teacher = new Teacher("Richard", "Ross", "richard@gmail.com", Subjects.valueOf("English"));
        Learners learners = new Learners("greg", "folks","greg@gmail.com", Subjects.Afrikaans);
        Lesson lesson = new Lesson(teacher, learners, LocalDate.now());

        teacher.setLessons(Subjects.valueOf("History"));
        teacher.setLessons(Subjects.valueOf("Biology"));
        teacher.setLessons(Subjects.valueOf("Sciences"));
        learners.setLessons(Subjects.valueOf("History"));
        learners.setLessons(Subjects.valueOf("Biology"));
        learners.setLessons(Subjects.valueOf("Sciences"));
        learners.setLessons(Subjects.valueOf("Mathematics"));



        assertEquals(0, lesson.learnerTokens());
    }
}
