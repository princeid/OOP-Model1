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

    private Applicant applicant1;
    private Applicant applicant2;
    private Applicant applicant3;

    List<Student> studentList;
    List<Applicant> applicantList;

    @BeforeEach
    void setup() {
        principal = new Principal("Lekan", 26, "male", "080-220-4010", "lekan@example.com", 250000.00,
                "principal", 2);
        studentList = new ArrayList<Student>();
    }

    /**
     *  Only the principal can expel a student from the school
     */
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
    void admitApplicantBasedonAge() {
        applicant1 = new Applicant("Gino", 8, "male", "011-777-0101", "gino@example.com");
        applicant2 = new Applicant("Lisa", 23, "female", "111-555-0101", "lisa@example.com");
        applicant3 = new Applicant("Jude", 21, "male", "211-707-3101", "jude@example.com");

        applicantList = new ArrayList<Applicant>();

        applicantList.add(applicant1);
        applicantList.add(applicant2);

        assertAll(
                () -> assertEquals("Admission Denied. Minimum age requirement is 50", Principal.admitApplicant(applicantList, applicant1, studentList)),
                () -> assertEquals("Admission Successful. Lisa has been admitted to class1",
                        Principal.admitApplicant(applicantList, applicant2, studentList))
        );
    }

    @Test
    void admitApplicantTestForClassCapacity() {
        applicant1 = new Applicant("Gino", 8, "male", "011-777-0101", "gino@example.com");
        applicant2 = new Applicant("Lisa", 23, "female", "111-555-0101", "lisa@example.com");
        applicant3 = new Applicant("Jude", 21, "male", "211-707-3101", "jude@example.com");

        applicantList = new ArrayList<Applicant>();

        applicantList.add(applicant1);
        applicantList.add(applicant2);
        applicantList.add(applicant3);

        assertEquals("Admission Denied. Class capacity is full", Principal.admitApplicant(applicantList, applicant3, studentList));
    }
}