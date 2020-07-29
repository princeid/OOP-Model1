package School;

public class Teacher extends Staff implements Course {

    String classAssigned;

    public Teacher(String name,
                   int age, String gender, String phone, String email, double salary, String jobTitle, int id, String classAssigned) {
        super(name, age, gender, phone, email, salary, jobTitle, id);
        this.classAssigned = classAssigned;
    }

    /*
     The teacher is Implementing the Course Interface
     */
    public String viewCourses() {
        if (classAssigned.equals("class1")) {
            Classes level = Classes.CLASS1;
            String classes = level.getClasses();
            System.out.println( getName() + ", you're taking Class1 on: " + classes);
            return getName() + ", you're taking Class1 on: " + classes;
        }
        if (classAssigned.equals("class2")) {
            Classes level = Classes.CLASS2;
            String classes = level.getClasses();
            System.out.println( getName() + ", you're taking Class2 on: " + classes);
            return getName() + ", you're taking Class2 on: " + classes;
        }
        if (classAssigned.equals("class3")) {
            Classes level = Classes.CLASS3;
            String classes = level.getClasses();
            System.out.println( getName() + ", you're taking Class3 on: " + classes);
            return getName() + ", you're taking Class3 on: " + classes;
        }
        return "Invalid";
    }

    public String attendClass() {
        if (classAssigned.equals("class1")) {
            Classes level = Classes.CLASS1;
            String classes = level.getClasses();
            System.out.println("I am teaching a class now");
            return "I am teaching a class now";
        }
        if (classAssigned.equals("class2")) {
            Classes level = Classes.CLASS2;
            String classes = level.getClasses();
            System.out.println("I am teaching a class now");
            return "I am teaching a class now";
        }
        if (classAssigned.equals("class3")) {
            Classes level = Classes.CLASS3;
            String classes = level.getClasses();
            System.out.println("I am teaching a class now");
            return "I am teaching a class now";
        }
        return "Invalid";
    }
}
