package School;

import java.util.List;

public class Principal extends Staff {

    public Principal(String name, int age, String gender, String phone, String email, double salary, String jobTitle,
     int id) {
        super(name, age, gender, phone, email, salary, jobTitle, id);
    }

    public static int expelStudent(List<Student> theStudent, String studentName) {
        for (Student student : theStudent) {
            if (studentName.equals(student.getName())) {
                theStudent.remove(student);
            }
        }
        return theStudent.size();
    }

    public static String admitApplicant(List<Applicant> applicantList, Applicant theApplicant, List<Student> theStudent) {
        if (theApplicant.getAge() < 10) {
            return "Admission Denied. Minimum age requirement is 50";
        }
        if (applicantList.size() > 2) {
            return "Admission Denied. Class capacity is full";
        }

        Student student = new Student(theApplicant.getName(), theApplicant.getAge(), theApplicant.getGender(),
                theApplicant.getPhone(), theApplicant.getEmail(), 100000, 0, 0, "class1", 4);
        theStudent.add(student);
        return "Admission Successful. " + student.getName() + " has been admitted to " + student.getClassAssigned();
    }

}