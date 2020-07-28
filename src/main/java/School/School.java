package School;

import java.util.List;

public class School {
    private List<Applicant> applicant;
    private List<Staff> staff;
    private List<Student> student;

    public School(List<Applicant> applicant, List<Staff> staff, List<Student> student) {
        this.applicant = applicant;
        this.staff = staff;
        this.student = student;
    }

    public List<Applicant> getApplicant() {
        return applicant;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public List<Student> getStudent() {
        return student;
    }
}