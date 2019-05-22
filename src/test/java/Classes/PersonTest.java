package Classes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void ShouldTestPersonString(){

        String name = "Richard";
        String email = "richard@accenture.co.za";
        String surname = "Ross";

        Learners learners = new Learners(name,surname,email,Lessons.valueOf("English"));

        assertEquals( "richard@accenture.co.za", learners.getEmail());
        assertEquals( "Richard",learners.getName());
        assertEquals( "Ross", learners.getSurname());
        assertEquals( Lessons.English, learners.getLessons());
    }


    @Test
    public void ShouldTestPersonStringTwo(){
        Learners learners = new Learners("Andre", "Pro", "Andre.Mentor@mail.co.za",Lessons.valueOf("English"));

        learners.setLessons(Lessons.valueOf("Mathematics"));
        learners.setLessons(Lessons.valueOf("History"));


        assertEquals( "Andre.Mentor@mail.co.za", learners.getEmail());
        assertEquals( "Andre",learners.getName());
        assertEquals( "Pro", learners.getSurname());
        assertEquals( Lessons.History, learners.getLessons());
    }
}
