package School;

public class Student extends Person implements Course {
    private int totalFees;
    private int feesPaid;
    private int gradeScore;
    private String classAssigned;
    private int id;

    public Student(String name, int age, String gender, String phone, String email, int totalFees,
                   int feesPaid,
                   int gradeScore, String classAssigned, int id) {
        super(name, age, gender, phone, email);
        this.totalFees = totalFees;
        this.feesPaid = feesPaid;
        this.gradeScore = gradeScore;
        this.classAssigned = classAssigned;
        this.id = id;
    }

    public int getTotalFees() {
        return totalFees;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getGradeScore() {
        return gradeScore;
    }

    public String getClassAssigned() {
        return classAssigned;
    }

    public int getId() {
        return id;
    }

    public void takeCourse() {
        Classes level = Classes.CLASS1;
    }
}
