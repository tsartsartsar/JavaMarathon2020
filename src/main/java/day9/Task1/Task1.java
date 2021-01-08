package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Bob", "KZ-22");
        Teacher teacher = new Teacher("Nik", "Biology");

        System.out.println(student.getGroup());
        System.out.println(teacher.getTheme());

        student.printInfo();
        teacher.printInfo();
    }
}
