package School;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class StaffTest {

    Staff staff;

    @BeforeEach
    void setup() {
        staff = new Staff("Bisi", 25, "male", "080-220-4010", "lekan@example.com", 220000.00,
                "teacher", 1111);
    }

    @Test
    void getSalary() {
        assertEquals(220000.00, staff.getSalary());
    }

    @Test
    void getJobTitle() {
        assertEquals("teacher", staff.getJobTitle());
    }

    @Test
    void getId() {
        assertEquals(1111, staff.getId());
    }
}