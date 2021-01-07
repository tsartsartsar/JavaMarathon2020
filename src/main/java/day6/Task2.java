package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("boeing", 2010, 200, 50);
        airplane.info();

        airplane.setYear(2012);
        airplane.setLength(198);
        airplane.fillUp(48);
        airplane.fillUp(3);
        airplane.info();
    }
}
