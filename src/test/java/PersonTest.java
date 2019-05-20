import Classes.Learners;
import Classes.Person;
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

        assertEquals( "richard@accenture.co.za", learners.getEmail());
        assertEquals( "Richard",learners.getName());
        assertEquals( "Ross", learners.getSurname());
    }
}
