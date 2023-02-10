package ss05_Access_modifier.exercise.student;

import ss05_Access_modifier.exercise.student.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student.setName("Tuấn Kiệt");
        Student.setClasses("A1022I1");
        System.out.println(Student.getName());
        System.out.println(Student.getClasses());
    }
}
