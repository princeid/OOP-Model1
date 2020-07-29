package School;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void setup() {
        person = new Person("Prince", 28, "male", "070-000-4010", "prince@example.com");
    }

    @Test
    void getName() {
        assertEquals("Prince", person.getName());
    }

    @Test
    void getAge() {
        assertEquals(28, person.getAge());
    }


    @Test
    void getGender() {
        assertEquals("male", person.getGender());
    }

    @Test
    void getPhone() {
        assertEquals("070-000-4010", person.getPhone());
    }

    @Test
    void getEmail() {
        assertEquals("prince@example.com", person.getEmail());
    }
}