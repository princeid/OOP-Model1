package School;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//      Principal principal = new Principal("Prince", 40, "male", "070-000-4110", "test@example.com", 50.9);

        Teacher teacher = new Teacher("Prince", 28, "male", "070-000-4010", "prince@example.com", 700000.00, "teacher", 1);
        Principal principal = new Principal("Lekan", 26, "male", "080-220-4010", "lekan@example.com", 250000.00,
                "principal", 2);
        NonAcademic nonAcademic = new NonAcademic("Jane", 34, "female", "090-110-4010", "jane@example.com", 100000.00,
                "non academic staff", 3);

        List<Staff> staffList = new ArrayList<Staff>();
        staffList.add(teacher);
        staffList.add(principal);
        staffList.add(nonAcademic);

        Applicant applicant1 = new Applicant("Gino", 21, "male", "011-777-0101", "gino@example.com");
        Applicant applicant2 = new Applicant("Lisa", 23, "female", "111-555-0101", "lisa@example.com");
        Applicant applicant3 = new Applicant("Jude", 21, "male", "211-707-3101", "jude@example.com");

        List<Applicant> applicantList = new ArrayList<Applicant>();
        applicantList.add(applicant1);
        applicantList.add(applicant2);
        applicantList.add(applicant3);

        Student student1 = new Student("Mike", 24,"male", "090-711-0011", "mike@example.com", 100000, 0, 0, "class1",
                1);
        Student student2 = new Student("James", 27,"male", "555-711-0011", "james@example.com", 100000, 0, 0, "class2", 2);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);

        School aladumo = new School(applicantList, staffList, studentList);
        System.out.println("APPLICANTS LISTS: " + aladumo.getApplicant());
        System.out.println("STAFF LISTS: " + aladumo.getStaff());
        System.out.println("STUDENT LISTS: " + aladumo.getStudent());

        Classes classes = Classes.CLASS1;
        System.out.println(classes);
        teacher.takeCourse();

        System.out.println("Before expelling Mike: " + studentList.size());
        Principal.expelStudent(studentList, student1.getName());
        System.out.println("After expelling Mike: " + studentList.size());

        Principal.admitApplicant(applicantList, applicant1, studentList);


    }
}