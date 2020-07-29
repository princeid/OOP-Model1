package School;

public class Student extends Person implements Course {
    private int totalFees;
    private int feesPaid;
    private int gradeScore;
    private String classAssigned;
    private int id;

    public Student(String name, int age, String gender, String phone, String email, int totalFees, int feesPaid, int gradeScore, String classAssigned,
                   int id) {
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

    /**
     * The student is Implementing the Course Interface by viewing the list of courses he/she is to attend
     */
    public String viewCourses() {
        if (classAssigned.equals("class1")) {
            Classes level = Classes.CLASS1;
            String classes = level.getClasses();
            System.out.println(getName() + ", here's a list of your Class1 courses for the term: " + classes);
            return getName() + ", here's a list of your Class1 courses for the term: " + classes;
        }
        if (classAssigned.equals("class2")) {
            Classes level = Classes.CLASS2;
            String classes = level.getClasses();
            System.out.println(getName() + ", here's a list of your Class2 courses for the term: " + classes);
            return getName() + ", here's a list of your Class2 courses for the term: " + classes;
        }
        if (classAssigned.equals("class3")) {
            Classes level = Classes.CLASS3;
            String classes = level.getClasses();
            System.out.println(getName() + ", here's a list of your Class3 courses for the term: " + classes);
            return getName() + ", here's a list of your Class3 courses for the term: " + classes;
        }
        return "Invalid";
    }

    /**
     *  The student is Implementing the Course Interface by viewing the list of courses he/she is to attend
     */
    public String attendClass() {
        if (classAssigned.equals("class1")) {
            Classes level = Classes.CLASS1;
            String classes = level.getClasses();
            System.out.println("I am attending a class now");
            return "I am attending a class now";
        }
        if (classAssigned.equals("class2")) {
            Classes level = Classes.CLASS2;
            String classes = level.getClasses();
            System.out.println("I am attending a class now");
            return "I am attending a class now";
        }
        if (classAssigned.equals("class3")) {
            Classes level = Classes.CLASS3;
            String classes = level.getClasses();
            System.out.println("I am attending a class now");
            return "I am attending a class now";
        }
        return "Invalid";
    }
}
