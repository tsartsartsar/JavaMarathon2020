package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplaneOne = new Airplane("boeing", 2010, 100, 50);
        Airplane airplaneTwo = new Airplane("su-1337", 2015, 100, 20);
        Airplane.compareAirplanes(airplaneOne, airplaneTwo);
    }
}