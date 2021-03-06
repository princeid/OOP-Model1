package School;

/**
 * Assigning a list of courses for each class
 */
public enum Classes {
    CLASS1("Maths, English, Chemistry, Physics"),
    CLASS2("Literature, Economics, Government, Agric"),
    CLASS3("Music, History, Food & Nutrition, Banking & Finance");

    private String value;

    Classes (String value) {
        this.value = value;
    }

    public String getClasses() {
        return this.value;
    }
}