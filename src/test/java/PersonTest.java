import Classes.Lessons;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void ShouldTestPersonString(){
//        Lessons lessons = new Lessons();
        Person person = new Person("Richard", "Ross", Lessons.afrikaans, "richross@gmail.com");
        assertEquals(person.getEmail(), "richross@gmail.com");
        assertEquals(person.getName(), "Richard");
        assertEquals(person.getSubject(), Lessons.afrikaans);
        assertEquals(person.getSurname(), "Ross");
    }
}
