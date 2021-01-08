package day9.Task1;

public class Teacher extends Human {
    private String theme;

    public Teacher(String name, String theme) {
        super(name);
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + name);
    }
}
