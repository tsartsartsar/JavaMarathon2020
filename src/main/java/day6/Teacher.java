package day6;

public class Teacher {
    private String name;
    private String theme;

    public Teacher(String name, String theme) {
        this.name = name;
        this.theme = theme;
    }

    public void evaluate(Student student){
        int x = (int) (2 + Math.random() * 4);
        String rate = null;
        switch (x){
            case 2:
                rate = "неудовлетворительно";
                break;
            case 3:
                rate = "удовлетворительно";
                break;
            case 4:
                rate = "хорошо";
                break;
            case 5:
                rate = "отлично";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + theme + " на оценку " + rate);
    }
}
