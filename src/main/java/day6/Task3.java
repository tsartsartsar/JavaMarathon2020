package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Bob", "Biology");
        Student student = new Student("Billy");

        teacher.evaluate(student);
    }
}
