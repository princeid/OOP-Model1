package School;

public class Teacher extends Staff implements Course {

    public Teacher(String name, int age, String gender, String phone, String email, double salary, String jobTitle,
                   int id) {
        super(name, age, gender, phone, email, salary, jobTitle, id);
    }

    public void takeCourse() {
        Classes level = Classes.CLASS1;
        System.out.println("Name: " + getName() + " | Job Title: " + getJobTitle() + " | Class: " + level
                        );
    }
}
