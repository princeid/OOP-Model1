package School;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student1;
    private Student student2;
    private Student prince;

    @BeforeEach
    void setup() {
        prince = new Student("Prince", 26,"male", "090-715-8888", "prince@example.com", 10000, 2500, 95, "class3",
                3);
    }

    @Test
    void getTotalFees() {
        assertEquals(10000, prince.getTotalFees());
    }

    @Test
    void getFeesPaid() {
        assertEquals(2500, prince.getFeesPaid());
    }

    @Test
    void getGradeScore() {
        assertEquals(95, prince.getGradeScore());
    }

    @Test
    void getClassAssigned() {
        assertEquals("class3", prince.getClassAssigned());
    }

    @Test
    void getId() {
        assertEquals(3, prince.getId());
    }

    /**
     *  Once a student is created, the courses and the class assigned to that student can be viewed by calling the viewCourses method on that
     *  particular student object.
     */
    @Test
    void viewCourses() {
        student1 = new Student("Mike", 24,"male", "090-711-0011", "mike@example.com", 100000, 0, 0, "class1",
                1);
        student2 = new Student("James", 27,"male", "555-711-0011", "james@example.com", 100000, 0, 0, "class2", 2);

        String student1Courses = student1.viewCourses();
        String student2Courses = student2.viewCourses();

        assertAll(
                () -> assertEquals("Mike, here's a list of your Class1 courses for the term: Maths, English, Chemistry, Physics", student1Courses),
                () -> assertEquals("James, here's a list of your Class2 courses for the term: Literature, Economics, Government, Agric",
                        student2Courses)
        );
    }

    /**
     * The student Class implements the attend method in the Course Interface
     */
    @Test
    void attendClass() {
        student1 = new Student("Mike", 24,"male", "090-711-0011", "mike@example.com", 100000, 0, 0, "class1",
                1);

        String student1IsHavingClass = student1.attendClass();

        assertEquals("I am attending a class now", student1IsHavingClass);

    }
}