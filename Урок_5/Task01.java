package Урок_5;

import java.util.*;

public class Task01 {

    public static void main(String[] args) {
        Student st1 = new Student("Петя Пяточкин", 20, true, "ФК-071", 4.5);
        Student st2 = new Student("Вася Пупкин", 20, true, "ФК-071", 4.2);
        Student st3 = new Student("Маша Иванова", 20, false, "ПМ-081", 5.0);
        Student st4 = new Student("Катя Ермалаева", 21, false, "ПМ-081", 3.5);
        Student st5 = new Student("Ваня Калюжный", 20, true, "ФК-071", 3.6);
        Student st6 = new Student("Петя Нагорный", 20, true, "ФК-071", 4.5);
        Student st7 = new Student("Дима Бима", 20, true, "ФК-071", 4.5);

        Teacher t1 = new Teacher("Марья Ивановна", 49, false, "доцент", "економика");
        Teacher t2 = new Teacher("Александр Павлович", 29, true, "аспирант", "електрооборудование");
        Teacher t3 = new Teacher("Светлана Ивановна", 32, false, "професор", "економика");
        Teacher t4 = new Teacher("Аристарх Эдуардович", 69, true, "професор", "филосовия древнего мира");

        List<Student> students = Arrays.asList(st1, st2, st3, st4, st5, st6, st7);
        List<Teacher> teachers = Arrays.asList(t1, t2, t3, t4);

        UniversityManager manager = new UniversityManager();

        System.out.println("Список студентов группы ФК-071 ");
        List<Student> FK = manager.getStudentsFromTheSameGroup(students, "ФК-071");
        for (Student student : FK)
            System.out.println(student);

        System.out.println("Список доцентов ");
        List<Teacher> docents = manager.getDocents(teachers);
        for (Teacher teacher : docents)
            System.out.println(teacher);

    }
}