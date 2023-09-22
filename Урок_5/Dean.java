package Урок_5;

public class Dean extends Person {
    // факультет декана
    private String faculty;

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Dean(String name, int age, boolean isMale, String faculty) {
        super(name, age, isMale);
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Декан " + getName() + " на факультете " + getFaculty();
    }
}