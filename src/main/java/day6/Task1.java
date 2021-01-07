package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2004, "yellow", "kawasaki");
        Car car = new Car();
        car.setYear(2001);
        car.setColor("black");
        car.setModel("audi");

        car.info();
        motorbike.info();

        System.out.println();

        System.out.println(car.yearDifference(1998));
        System.out.println(motorbike.yearDifference(1900));
    }
}
