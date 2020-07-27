package School;

public class Teacher extends Staff implements Course {

    public Teacher(String name, int age, String gender, String phone, String email, double salary, String jobDescription) {
        super(name, age, gender, phone, email, salary, jobDescription);
    }

    public void takeCourse() {
        Classes classes = Classes.CLASS1;

        System.out.println("My name is " + getName());

    }
}
