package Classes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void ShouldTestPersonString(){

        String name = "Richard";
        String email = "richard@accenture.co.za";
        String surname = "Ross";

        Learners learners = new Learners(name,surname,email, Subjects.valueOf("English"));

        assertEquals( "richard@accenture.co.za", learners.getEmail());
        assertEquals( "Richard",learners.getName());
        assertEquals( "Ross", learners.getSurname());
        assertEquals( Subjects.English, learners.getSubjects());
    }


    @Test
    public void ShouldTestPersonStringTwo(){
        Learners learners = new Learners("Andre", "Pro", "Andre.Mentor@mail.co.za", Subjects.valueOf("English"));

        learners.setLessons(Subjects.valueOf("Mathematics"));
        learners.setLessons(Subjects.valueOf("History"));


        assertEquals( "Andre.Mentor@mail.co.za", learners.getEmail());
        assertEquals( "Andre",learners.getName());
        assertEquals( "Pro", learners.getSurname());
        assertEquals( Subjects.History, learners.getSubjects());
    }
}
