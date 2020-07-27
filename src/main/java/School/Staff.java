package School;

public class Staff extends Person{
    private double salary;
    private String jobDescription;

    public Staff(String name, int age, String gender, String phone, String email, double salary, String jobDescription) {
        super(name, age, gender, phone, email);
        this.salary = salary;
        this.jobDescription = jobDescription;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
