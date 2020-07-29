package School;

public class Staff extends Person {
    private double salary;
    private String jobTitle;
    private int id;

    public Staff(String name, int age, String gender, String phone, String email, double salary,
                 String jobTitle, int id) {
        super(name, age, gender, phone, email);
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getId() {
        return id;
    }
}