package School;

import java.util.List;

public class Department {
    private List<Applicant> applicant;
    private List<Staff> staff;
    private List<Student> student;

    public Department(List<Applicant> applicant, List<Staff> staff, List<Student> student) {
        this.applicant = applicant;
        this.staff = staff;
        this.student = student;
    }

    public List<Applicant> getApplicant() {
        return applicant;
    }

    public void setApplicant(List<Applicant> applicant) {
        this.applicant = applicant;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
}
