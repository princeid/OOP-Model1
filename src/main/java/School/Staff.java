package School;

public class Staff extends Person{
    private double salary;

    public Staff(String name, int age, String gender, String phone, String email, double salary) {
        super(name, age, gender, phone, email);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
