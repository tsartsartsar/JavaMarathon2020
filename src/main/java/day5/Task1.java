package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2000);
        car.setColor("red");
        car.setModel("toyota");
        System.out.println(car.getYear() + ", " + car.getColor() + ", " + car.getModel());
    }
}
