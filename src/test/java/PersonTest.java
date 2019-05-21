import Classes.Learners;
import Classes.Lessons;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void ShouldTestPersonString(){
        Learners learners = new Learners();

        String name = "Richard";
        String email = "richard@accenture.co.za";
        String surname = "Ross";


        learners.setName(name);
        learners.setEmail(email);
        learners.setSurname(surname);
        learners.setLessons(Lessons.valueOf("English"));


        assertEquals( "richard@accenture.co.za", learners.getEmail());
        assertEquals( "Richard",learners.getName());
        assertEquals( "Ross", learners.getSurname());
        assertEquals( Lessons.English, learners.getLessons());
    }


    @Test
    public void ShouldTestPersonStringTwo(){
        Learners learners = new Learners();

        String name = "Andre";
        String email = "Andre.Mentor@mail.co.za";
        String surname = "Mentor";


        learners.setName(name);
        learners.setEmail(email);
        learners.setSurname(surname);
        learners.setLessons(Lessons.valueOf("English"));
        learners.setLessons(Lessons.valueOf("Mathematics"));
        learners.setLessons(Lessons.valueOf("History"));


        assertEquals( "Andre.Mentor@mail.co.za", learners.getEmail());
        assertEquals( "Andre",learners.getName());
        assertEquals( "Mentor", learners.getSurname());
        assertEquals( Lessons.History, learners.getLessons());
    }
}
