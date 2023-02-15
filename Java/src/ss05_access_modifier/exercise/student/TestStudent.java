package ss05_access_modifier.exercise.student;

public class TestStudent {
    public static void main(String[] args) {
        Student.setName("Tuấn Kiệt");
        Student.setClasses("A1022I1");
        System.out.println(Student.getName());
        System.out.println(Student.getClasses());
    }
}
