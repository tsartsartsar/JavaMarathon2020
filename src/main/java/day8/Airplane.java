package day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public int fillUp(int number){
        fuel += number;
        return fuel;
    }

    public int getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Airplane " +
                "producer = '" + producer + '\'' +
                ", year = " + year +
                ", length = " + length +
                ", weight = " + weight +
                ", fuel = " + fuel;
    }
}
