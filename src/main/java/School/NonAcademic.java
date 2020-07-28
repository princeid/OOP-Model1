package School;

public abstract class NonAcademic extends Staff {

    public NonAcademic(String name, int age, String gender, String phone, String email, double salary,
                       String jobTitle, int id) {
        super(name, age, gender, phone, email, salary, jobTitle, id);
    }

    // Duty method is to be implemented by the sub classes of the non-academic staffs, like cleaners, security, etc.
    public abstract void duty();
}
