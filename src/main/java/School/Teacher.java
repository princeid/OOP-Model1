package School;

public class Teacher extends Staff implements Course {

    public Teacher(String name, int age, String gender, String phone, String email, double salary) {
        super(name, age, gender, phone, email, salary);
    }

    public void takeCourse() {

    }
}
