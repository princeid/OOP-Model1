package School;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    private Teacher teacher1;
    private Teacher teacher2;
    private Teacher teacher3;

    /**
     *  Once a teacher is created, the courses and the class the teacher is to take can be viewed by calling the viewCourses method
     *  on that particular teacher object.
     */
    @Test
    void viewCourses() {
        teacher1 = new Teacher("Prince", 28, "male", "070-000-4010", "prince@example.com", 700000.00,
                "teacher", 1, "class1");
        teacher2 = new Teacher("Dickson", 29, "male", "110-000-4550", "dickson@example.com", 800000.00,
                "teacher", 2, "class2");
        teacher3 = new Teacher("Jane", 30, "female", "091-111-4022", "jane@example.com", 900000.00,
                "teacher", 3, "class3");

        String result1 = teacher1.viewCourses();
        String result2 = teacher2.viewCourses();
        String result3 = teacher3.viewCourses();
        assertAll(
                () -> assertEquals("Prince, you're taking Class1 on: Maths, English, Chemistry, Physics", result1),
                () -> assertEquals("Dickson, you're taking Class2 on: Literature, Economics, Government, Agric", result2),
                () -> assertEquals("Jane, you're taking Class3 on: Music, History, Food & Nutrition, Banking & Finance", result3)
        );
    }

    /**
     * The teacher Class implements the attend method in the Course Interface
     */
    @Test
    void attendClass() {
        teacher1 = new Teacher("Prince", 28, "male", "070-000-4010", "prince@example.com", 700000.00,
                "teacher", 1, "class1");

        String teacher1IsTeachingClass = teacher1.attendClass();

        assertEquals("I am teaching a class now", teacher1IsTeachingClass);
    }
}