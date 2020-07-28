package School;

public enum Classes {
    CLASS1("Maths, English, Chemistry, Physics"),
    CLASS2("Literature, Economics, Government, Agric"),
    CLASS3("Music, History, Food & Nutrition, Banking & Finance");

    private String value;

    private Classes (String value) {
        this.value = value;
    }

    public String getClasses() {
        return this.value;
    }
}