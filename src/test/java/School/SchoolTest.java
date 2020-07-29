package School;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SchoolTest {

    private List<Applicant> applicantList = new ArrayList<Applicant>();
    private List<Staff> staffList = new ArrayList<Staff>();
    private List<Student> studentList = new ArrayList<Student>();

    Applicant applicant1;
    Applicant applicant2;
    Applicant applicant3;

    Teacher teacher;
    Principal principal;

    Student student1;

    School aladumo = new School(applicantList, staffList, studentList);

    @Test
    void getApplicant() {
        applicant1 = new Applicant("Gino", 21, "male", "011-777-0101", "gino@example.com");
        applicant2 = new Applicant("Lisa", 23, "female", "111-555-0101", "lisa@example.com");
        applicant3 = new Applicant("Jude", 21, "male", "211-707-3101", "jude@example.com");

        applicantList.add(applicant1);
        applicantList.add(applicant2);
        applicantList.add(applicant3);

        assertEquals(applicantList, aladumo.getApplicant());
    }

    @Test
    void getStaff() {
        teacher = new Teacher("Prince", 28, "male", "070-000-4010", "prince@example.com", 700000.00, "teacher", 1, "class1");
        principal = new Principal("Lekan", 26, "male", "080-220-4010", "lekan@example.com", 250000.00, "principal", 2);
        staffList.add(teacher);
        staffList.add(principal);

        assertEquals(staffList, aladumo.getStaff());
    }

    @Test
    void getStudent() {
        student1 = new Student("Mike", 24,"male", "090-711-0011", "mike@example.com", 100000, 0, 0, "class1",
                1);
        studentList.add(student1);

        assertEquals(studentList, aladumo.getStudent());
    }
}