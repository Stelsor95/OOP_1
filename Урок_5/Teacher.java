package Урок_5;

public class Teacher extends Person {
    // звание
    private String title;
    // предмет который он читает
    private String subject;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, int age, boolean isMale, String title, String subject) {
        super(name, age, isMale);
        this.title = title;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Учитель " + getName() + " имеет ученую степень " + getTitle() + " и преподает " + getSubject();
    }
}