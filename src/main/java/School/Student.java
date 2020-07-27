package School;

public class Student extends Person implements Course{
    private int totalFees;
    private int feesPaid;
    private int gradeScore;

    public Student(String name, int age, String gender, String phone, String email, int totalFees, int feesPaid,
                   int gradeScore) {
        super(name, age, gender, phone, email);
        this.totalFees = totalFees;
        this.feesPaid = feesPaid;
        this.gradeScore = gradeScore;
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

    public void takeCourse() {

    }
}
