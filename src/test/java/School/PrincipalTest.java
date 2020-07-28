package School;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PrincipalTest {

    private Student student1;
    private Student student2;
    private Student prince;

    private Principal principal;
    List<Student> studentList;

    @BeforeEach
    void setup() {
        principal = new Principal("Lekan", 26, "male", "080-220-4010", "lekan@example.com", 250000.00,
                "principal", 2);
        studentList = new ArrayList<Student>();
    }

    @Test
    void expelStudent() {
        student1 = new Student("Mike", 24,"male", "090-711-0011", "mike@example.com", 100000, 0, 0, "class1",
                1);
        student2 = new Student("James", 27,"male", "555-711-0011", "james@example.com", 100000, 0, 0, "class2", 2);
        studentList.add(student1);
        studentList.add(student2);
        int listBeforeDelete = studentList.size();
        int delete1 = Principal.expelStudent(studentList, student1.getName());

        assertAll(
                () -> assertEquals(2, listBeforeDelete),
                () -> assertEquals(1, delete1)
        );
    }

    @Test
    void admitApplicant() {
    }
}